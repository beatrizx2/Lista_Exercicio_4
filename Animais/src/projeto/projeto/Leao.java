package projeto;

public class Leao extends AnimalAB{

	@Override
    public void comer(double comida) {
        this.comida = comida;  
        System.out.println("O leao comeu " + comida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;  
        System.out.println("O leao se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;  
        System.out.println("O leao dormiu por " + horasD + " horas.");
    }
}