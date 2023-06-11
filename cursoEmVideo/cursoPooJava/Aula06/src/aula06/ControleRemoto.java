package aula06;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // Métodos abstratos

    @Override
    public void ligar() {
        if (!this.isLigado()) {
            this.setLigado(true);
            System.out.println("Ligado!");
        } else {
            System.out.println("O controle já está ligado!");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado()) {
            this.setLigado(false);
            System.out.println("Desligado!");
        } else {
            System.out.println("O controle já está desligado!");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("----------MENU----------");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i < this.getVolume(); i+=10) {
                System.out.print("[]");
            }
            System.out.println("\n------------------------");            
        } else {
            System.out.println("Não é possível abrir o menu com o controle desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando o menu...");  
        } else {
            System.out.println("Não é possível fechar o menu com o controle desligado!");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume aumentado!");
        } else {
            System.out.println("Impossível aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume dirminuido!");
        } else {
            System.out.println("Impossível dirminuir volume!");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mutado!");
        } else {
            System.out.println("Não é possível mutar no momento!");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Desmutado!");
        } else {
            System.out.println("Não é possível desmutar no momento!");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
            System.out.println("Play!");
        } else {
            System.out.println("Não é possível dar Play no momento!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("Pause!");
        } else {
            System.out.println("Não é possível dar Pause no momento!");
        }
    }
    
}
