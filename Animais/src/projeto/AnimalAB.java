package projeto;

public abstract class AnimalAB implements AnimalIF {
    public double comida;
    public double distancia;
    public double horasD;
    
    @Override()
    public abstract void getComer(double comida);
    
    @Override()
    public abstract void getMoverse(double distancia);
     
    @Override()
	public abstract void getDormir(int horasD);

}

