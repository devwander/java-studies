package aula05;

public class ContaBanco {
    public int numBanco;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumBanco());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("-----------------------------------");
    }

    public int getNumBanco() {
        return numBanco;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        
        switch (t) {
            case "CC":
                this.setSaldo(50);
                break;
            case "CP":
                this.setSaldo(150);
                break;
        }
        
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, pois ainda tem saldo!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, pois existe débito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito de " + v + " realizado com sucesso na conta de " + this.dono + "!");
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.dono);
            } else {
                System.out.println("Saldo insuficiente para realizar saque!");
            }
        } else {
            System.out.println("Inpossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.dono);
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada!");
        }
    }
}
