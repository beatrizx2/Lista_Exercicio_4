package projeto;
public abstract class AnimalAB implements AnimalIF {
    public double comida;
    public double distancia;
    public int horasD;
    
    @Override()
    public abstract void comer(double comida);
    
    @Override()
    public abstract void moverse(double distancia);
     
    @Override()
	public abstract void dormir(int horasD);

}

