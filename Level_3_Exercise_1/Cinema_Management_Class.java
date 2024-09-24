import java.util.Scanner;

public class GestioCine {
    private Cine cine;
    private Scanner scanner = new Scanner(System.in);

    public GestioCine(Cine cine) {
        this.cine = cine;
    }

    public int menu() {
        System.out.println("1. Show all reserved seats");
        System.out.println("2. Show seats reserved by a person");
        System.out.println("3. Reserve a seat");
        System.out.println("4. Cancel seat reservation");
        System.out.println("5. Cancel all reservations for a person");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public void mostrarButaques() {
        for (Butaca butaca : cine.getGestioButaques().getButaques()) {
            System.out.println(butaca);
        }
    }

    public void mostrarButaquesPersona() {
        String persona = introduirPersona();
        for (Butaca butaca : cine.getGestioButaques().getButaques()) {
            if (butaca.getPersona().equalsIgnoreCase(persona)) {
                System.out.println(butaca);
            }
        }
    }

    public void reservarButaca() {
        int fila = introduirFila();
        int seient = introduirSeient();
        String persona = introduirPersona();
        try {
            cine.getGestioButaques().afegirButaca(new Butaca(fila, seient, persona));
        } catch (ExcepcioButacaOcupada e) {
            System.out.println(e.getMessage());
        }
    }

    public void anularReserva() {
        int fila = introduirFila();
        int seient = introduirSeient();
        try {
            cine.getGestioButaques().eliminarButaca(fila, seient);
        } catch (ExcepcioButacaLliure e) {
            System.out.println(e.getMessage());
        }
    }

    public void anularReservaPersona() {
        String persona = introduirPersona();
        cine.getGestioButaques().getButaques().removeIf(butaca -> butaca.getPersona().equalsIgnoreCase(persona));
    }

    public String introduirPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person name: ");
        String persona = sc.nextLine();
        if (!persona.matches("[a-zA-Z ]+")) {
            try {
                throw new ExcepcioNomPersonaIncorrecte("Invalid name format!");
            } catch (ExcepcioNomPersonaIncorrecte e) {
                System.out.println(e.getMessage());
            }
        }
        return persona;
    }

    public int introduirFila() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int fila = sc.nextInt();
        if (fila < 1 || fila > cine.getFiles()) {
            try {
                throw new ExcepcioFilaIncorrecta("Invalid row number!");
            } catch (ExcepcioFilaIncorrecta e) {
                System.out.println(e.getMessage());
            }
        }
        return fila;
    }

    public int introduirSeient() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number: ");
        int seient = sc.nextInt();
        if (seient < 1 || seient > cine.getSeientsPerFila()) {
            try {
                throw new ExcepcioSeientIncorrecte("Invalid seat number!");
            } catch (ExcepcioSeientIncorrecte e) {
                System.out.println(e.getMessage());
            }
        }
        return seient;
    }
}
