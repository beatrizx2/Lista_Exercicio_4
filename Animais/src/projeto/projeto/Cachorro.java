package projeto;

public class Cachorro extends AnimalTerrestreAB {

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, altura, peso);
    }

    @Override
    public void comer(double comida) {
        this.comida = comida;
        System.out.println("O cachorro comeu " + comida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;
        System.out.println("O cachorro se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;
        System.out.println("O cachorro dormiu por " + horasD + " horas.");
    }
}
