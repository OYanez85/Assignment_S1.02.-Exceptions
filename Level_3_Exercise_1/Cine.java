import java.util.Scanner;  

public class Cine {
    private int files;
    private int seientsPerFila;
    private GestioButaques gestioButaques;
    private GestioCine gestioCine;

    public Cine() {
        this.gestioButaques = new GestioButaques();
        this.gestioCine = new GestioCine(this);
        demanarDadesInicials();
    }

    public int getFiles() {
        return files;
    }

    public int getSeientsPerFila() {
        return seientsPerFila;
    }

    public GestioButaques getGestioButaques() {
        return gestioButaques;
    }

    public void demanarDadesInicials() {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of rows: ");
        this.files = sc.nextInt();
        System.out.print("Enter the number of seats per row: ");
        this.seientsPerFila = sc.nextInt();
    }

    public void iniciar() {
        int option;
        do {
            option = gestioCine.menu();
            switch (option) {
                case 1:
                    gestioCine.mostrarButaques();
                    break;
                case 2:
                    gestioCine.mostrarButaquesPersona();
                    break;
                case 3:
                    gestioCine.reservarButaca();
                    break;
                case 4:
                    gestioCine.anularReserva();
                    break;
                case 5:
                    gestioCine.anularReservaPersona();
                    break;
            }
        } while (option != 0);
        System.out.println("Goodbye!");
    }
}

