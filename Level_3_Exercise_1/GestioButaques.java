import java.util.ArrayList;

public class GestioButaques {
    private ArrayList<Butaca> butaques;

    public GestioButaques() {
        this.butaques = new ArrayList<>();
    }

    public ArrayList<Butaca> getButaques() {
        return butaques;
    }

    public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
        if (cercarButaca(butaca.getFila(), butaca.getSeient()) != -1) {
            throw new ExcepcioButacaOcupada("Seat is already occupied!");
        }
        butaques.add(butaca);
    }

    public void eliminarButaca(int fila, int seient) throws ExcepcioButacaLliure {
        int index = cercarButaca(fila, seient);
        if (index == -1) {
            throw new ExcepcioButacaLliure("Seat is not reserved!");
        }
        butaques.remove(index);
    }

    public int cercarButaca(int fila, int seient) {
        for (int i = 0; i < butaques.size(); i++) {
            if (butaques.get(i).getFila() == fila && butaques.get(i).getSeient() == seient) {
                return i;
            }
        }
        return -1;
    }
}
