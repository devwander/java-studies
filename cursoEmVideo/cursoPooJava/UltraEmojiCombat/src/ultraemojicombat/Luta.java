package ultraemojicombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.desafiado = l1;
            this.desafiante = l2;
            this.aprovada = true;
            System.out.println("Luta entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome() + "\nmarcada com sucesso!");

        } else {
            System.out.println("Não foi possível marcar a luta!");
            this.desafiado = null;
            this.desafiante = null;
            this.aprovada = false;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("#### DESAFIADO ####");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE ####");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            System.out.println("====================================");
            
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("A luta entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
                    System.out.println("Acabou em empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("A luta entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
                    System.out.println("Acabou na vítoria de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("A luta entre " + this.desafiado.getNome() + " e " + this.desafiante.getNome());
                    System.out.println("Acabou na vítoria de " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
            System.out.println("====================================");
        } else {
            System.out.println("A luta não pode ocorrer!");
        }
    }
    
    // Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
