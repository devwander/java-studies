package aula012;

public class Aula012 {

    public static void main(String[] args) {
        // Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        System.out.println("===================");
        m.setPeso(20.5f);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("===================");
        
        System.out.println("===================");
        c.locomover();
        c.usarBolsa();
        c.emitirSom();
        System.out.println("===================");
        
        System.out.println("===================");
        k.locomover();
        k.emitirSom();
        System.out.println("===================");
        
    }
    
}
