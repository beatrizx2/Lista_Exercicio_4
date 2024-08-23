package projeto;

public abstract class AnimalVoadorAB extends AnimalAB {

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, int quantidadeAssas, double envergaduraAssa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, quantidadeAssas, envergaduraAssa, altura, peso);
    }

    public abstract void voar(double distancia);
}
