package projetolivro;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos especiais

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    public void detalhes() {
        System.out.println("================================");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página atual: " + this.pagAtual);
        System.out.println("Aberto? " + (this.aberto ? "Sim" : "Não"));
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("================================");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    // Métodos abstratos

    @Override
    public void abrir() {
        if (!this.isAberto()) {
            this.setAberto(true);
            System.out.println("Livro " + this.getTitulo() + " aberto!");
        } else {
            System.out.println("O livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            System.out.println("Livro " + this.getTitulo() + " fechado!");
        }
    }

    @Override
    public void folhear(int pag) {
        if (this.isAberto()) {
            if (pag <= this.getTotPaginas() && pag >= 1) {
                this.setPagAtual(pag);
        
                System.out.println("O livro " + this.getTitulo());
                System.out.println("foi folheado até a página " + this.getPagAtual());    
            } else {
                System.out.println("Não é possível folhear para uma\npágina que não existe!");
            }
        } else {
            System.out.println("Não é possível folhear um livro fechado!");
        }
    }
    
    @Override
    public void folhearAleatorio() {
        if (this.isAberto()) {
            Random aleatorio = new Random();
            int aleaPage = aleatorio.nextInt(this.getTotPaginas()) + 1;
            this.setPagAtual(aleaPage);
        
            System.out.println("O livro " + this.getTitulo());
            System.out.println("foi folheado aleatoriamente até a página " + this.getPagAtual());
            System.out.println("por " + this.getLeitor().getNome());
        } else {
            System.out.println("Não é possível folhear um livro fechado!");
        }
    }

    @Override
    public void avancarPag() {
        if (this.isAberto()) {
            if (this.getTotPaginas() != this.getPagAtual()) {
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("O leitor " + this.getLeitor().getNome() + " avançou a página");
                System.out.println("do livro " + this.getTitulo());
                System.out.println("=> " + this.getPagAtual() + "/" + this.getTotPaginas());
            } else {
                this.setPagAtual(1);
                System.out.println("O livro chegou ao fim!");
                System.out.println("Voltando ao começo...");
                System.out.println("=> " + this.getPagAtual() + "/" + this.getTotPaginas());
            }
        } else {
            System.out.println("Não é possível avançar a página de um livro fechado!");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            if (this.getPagAtual() != 1) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("O leitor " + this.getLeitor().getNome() + " voltou a página");
                System.out.println("do livro " + this.getTitulo());
                System.out.println("=> " + this.getPagAtual() + "/" + this.getTotPaginas());            
            } else {
                System.out.println("Não é possível voltar a página!");
                System.out.println("O livro está na primeira página...");
            }
        } else {
            System.out.println("Não é possível voltar a página de um livro fechado!");
        }
    }
    
}
