package projeto;

public class Peixe extends AnimalMarinhoAB {
    
    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, 0, altura, peso);
    }

    @Override
    public void comer(double comida) {
        this.comida = comida;
        System.out.println("O peixe comeu " + comida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;
        System.out.println("O peixe se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;
        System.out.println("O peixe dormiu por " + horasD + " horas.");
    }

    @Override
    public void nadar(double distancia) {
        this.distancia = distancia;
        System.out.println("O peixe nadou " + distancia + " metros.");
    }
}
