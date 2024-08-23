package projeto;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Doméstico", 0.6, 30);
        cachorro.comer(2.5);
        cachorro.moverse(100);
        cachorro.dormir(8);

        Elefante elefante = new Elefante("Dumbo", 10, "Savanas", 3.5, 5000);
        elefante.comer(50);
        elefante.moverse(500);
        elefante.dormir(5);

        Gato gato = new Gato("Mimi", 3, "Doméstico", 0.3, 20);
        gato.comer(0.2);
        gato.moverse(10);
        gato.dormir(12);
        
        Leao leao = new Leao("leo", 3, "savanas", 0.3, 60);
        leao.comer(0.2);
        leao.moverse(10);
        leao.dormir(12);
        
        Pombo pombo = new Pombo("Prupru", 3, "Campo", 1.5, 0.3, 2);
        pombo.voar(10);
        pombo.comer(0.2);
        pombo.dormir(12);
        pombo.moverse(10);

        
        Peixe peixe = new Peixe("Nemo", 2, "Água", 0.1, 2);
        peixe.nadar(10);
        peixe.comer(0.2);
        peixe.dormir(12);
        peixe.moverse(10);



    }
}
