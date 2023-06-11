package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumBanco(154546);
        p1.setDono("João");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumBanco(264651);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        
        p1.depositar(180);
        p2.depositar(400);
        
        p2.sacar(1000);
        p2.sacar(200);
        
        p1.fecharConta();
        p1.sacar(230);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
