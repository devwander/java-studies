package aula011;

public class Aula011 {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Silva");
        v1.setIdade(55);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(22);
        a1.setSexo("F");
        a1.setMatricula(2315);
        a1.setCurso("Informática");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Professor pr1 = new Professor();
        pr1.setNome("Marcos");
        pr1.setIdade(54);
        pr1.setSexo("M");
        pr1.setEspecialidade("Matemática");
        pr1.setSalario(3600.76f);
        System.out.println(pr1.toString());
        pr1.receberAumento(500);
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jõao");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(2555);
        b1.setCurso("Informática");
        b1.setBolsa(1200.50f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Antônio");
        t1.setIdade(19);
        t1.setSexo("M");
        t1.setMatricula(1556);
        t1.setCurso("Informática");
        System.out.println(t1.toString());
        t1.pagarMensalidade();
    }
    
}
