package aula011;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aum) {
        this.setSalario(this.getSalario() + aum);
        System.out.println("========================================");
        System.out.println("Parabéns professor(ar) " + this.getNome());
        System.out.println("Seu sálario foi aumentado para " + this.getSalario());
        System.out.println("========================================");
    }

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
