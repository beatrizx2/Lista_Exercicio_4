package projeto;

public class Gato extends AnimalAB{

	@Override
    public void comer(double comida) {
        this.comida = comida;  
        System.out.println("O gato comeu " + comida + " unidades de comida.");
    }

    @Override
    public void moverse(double distancia) {
        this.distancia = distancia;  
        System.out.println("O gato se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horasD) {
        this.horasD = horasD;  
        System.out.println("O gato dormiu por " + horasD + " horas.");
    }
}