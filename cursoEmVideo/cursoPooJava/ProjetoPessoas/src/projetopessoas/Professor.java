package projetopessoas;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    // Métodos
    public void receberAumento(int aum) {
        this.setSalario(this.getSalario() + aum);
        System.out.println("Sálario aumentado para " + this.getSalario() + " reais!");
    }
    
    // Métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
        
      
}
