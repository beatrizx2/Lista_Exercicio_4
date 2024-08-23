package projeto;

public class Pombo extends AnimalVoadorAB {
    
    public Pombo(String nome, int idade, String habitat, double envergaduraAssa, double altura, double peso) {
        super(nome, "Pombo", idade, habitat, 2, 2, envergaduraAssa, altura, peso);
    }
    
    @Override
    public void comer(double comida) {
        this.comida = comida;
        System.out.println("O pombo comeu " + comida + " unidades de comida.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;
        System.out.println("O pombo dormiu por " + horasD + " horas.");
    }

    @Override
    public void voar(double distancia) {
        this.distancia = distancia;
        System.out.println("O pombo voou " + distancia + " metros.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;
        System.out.println("O pombo se moveu " + distancia + " metros.");
}
}