package projetopessoas;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    // Métodos
    
    public void mudarTrabalho() {
        if (this.isTrabalhando()) {
            this.setTrabalhando(false);
            System.out.println("Parando de trabalhar!");
        } else {
            this.setTrabalhando(true);
            System.out.println("Começando a trabalhar!");
        }
    }
    
    // Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
