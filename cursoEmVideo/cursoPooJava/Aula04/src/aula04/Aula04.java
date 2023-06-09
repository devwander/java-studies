package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("", "Preta", 0.0f);
        
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        
        c1.status();
        
        System.out.println("------------------------------------");
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + "\nde ponta " + c1.getPonta());

        System.out.println("------------------------------------");
        
        Caneta c2 = new Caneta("NIC", "Laranja", 0.4f);
        
        c2.status();
    }
    
}
