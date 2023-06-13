package aula011;

public class Tecnico extends Aluno {
    private int registroProfissional;
    
    public void praticar() {
        System.out.println("========================================");
        System.out.println("O aluno técnico " + this.getNome() + " está praticando!");
        System.out.println("========================================");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
