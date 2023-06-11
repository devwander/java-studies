package aula06;

public class Aula06 {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        c.desligar();
        c.abrirMenu();
        
        c.maisVolume();
        c.abrirMenu();
        
        c.ligar();
        c.abrirMenu();
        
        c.maisVolume();
        c.abrirMenu();
        
        c.ligarMudo();
        c.abrirMenu();
        
        c.fecharMenu();
    }
    
}
