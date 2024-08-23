package projeto;

public abstract class AnimalMarinhoAB extends AnimalAB {
    
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, 0, 0.0, altura, peso); 
    }

    public abstract void nadar(double comida);
}

