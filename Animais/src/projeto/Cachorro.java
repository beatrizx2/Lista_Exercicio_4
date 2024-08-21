package projeto;

public class Cachorro extends AnimalAB {

	@Override
	public void getComer(double comida){
		this.comida+=comida;
    }

    @Override
    public void getMoverse(double distancia){
        this.distancia+=distancia;
    }

    @Override
    public void getDormir(int horasD) {
        this.horasD+=horasD;
    }   
}