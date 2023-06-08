package aula02;

public class Aula02 {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "Big";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.cargar = 90;
       c1.tampada = false;
       
       c1.tampar();
       c1.status();
       
       System.out.println("--------------------------------");
        
       c1.destampar();
       c1.status();
       
       System.out.println("--------------------------------");
       
       c1.rabiscar();
       
       System.out.println("--------------------------------");
       
       c1.tampar();
       c1.rabiscar();
       
       System.out.println("--------------------------------");
       
       Caneta c2 = new Caneta();
       c2.modelo = "Tree";
       c2.cor = "Vermelha";
       c2.ponta = 0.5f;
       c2.cargar = 90;
       c2.tampada = true;
       
       c2.status();
       
       c2.destampar();
       
       c2.rabiscar();
               
    }
    
}
