package aula013;

public class Aula013 {

    public static void main(String[] args) {
        // Animal a = new Animal();
        Mamifero m = new Mamifero();
        m.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
        
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(11, 5.1f);
        c.reagir(11, 00);
        
    }
    
}
