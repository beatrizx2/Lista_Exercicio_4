package projeto;

public class Leao extends AnimalAB{
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
    // Método main para teste
    public static void main(String[] args) {
        Leao leao = new Leao();
        leao.getComer(5);
        leao.getMoverse(10);
        leao.getDormir(8);
    }
}