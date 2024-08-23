package projeto;
public abstract class AnimalAB implements AnimalIF {
    public String nome;
    public String tipoAnimal;
    public int idade;
    public String habitat;
    public int quantidadePatas;
    public int quantidadeAssas;
    public double envergaduraAssa;
    public double altura;
    public double peso;
    public double comida;
    public double distancia;
    public int horasD;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAssas, double envergaduraAssa, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
        this.altura = altura;
        this.peso = peso;
    }
    
    @Override()
    public abstract void comer(double comida);
    
    @Override()
    public abstract void moverse(double distancia);
     
    @Override()
	public abstract void dormir(int horasD);

}

