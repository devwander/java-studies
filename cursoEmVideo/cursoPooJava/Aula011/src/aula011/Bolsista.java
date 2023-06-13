package aula011;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("========================================");
        System.out.println("A bolsa do aluno(a) " + this.getNome() + " foi renovada!");
        System.out.println("========================================");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("========================================");
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado!");
        System.out.println("========================================");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
