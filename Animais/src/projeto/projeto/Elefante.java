package projeto;

public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, altura, peso);
    }

    @Override
    public void comer(double comida) {
        this.comida = comida;
        System.out.println("O elefante comeu " + comida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;
        System.out.println("O elefante se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;
        System.out.println("O elefante dormiu por " + horasD + " horas.");
    }
}
