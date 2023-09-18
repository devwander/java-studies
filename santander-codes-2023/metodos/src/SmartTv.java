public class SmartTv {
  public boolean ligada = false;
  public int canal = 1;
  public int volume = 25;

  public void aumentarCanal() {
    this.canal++;
  }

  public void diminuirCanal() {
    this.canal--;
  }

  public void mudarCanal(int novoCanal) {
    this.canal = novoCanal;
  }

  public void aumentarVolume() {
    this.volume++;
  }

  public void diminuirVolume() {
    this.volume--;
  }

  public void ligar() {
    this.ligada = true;
  }

  public void desligar() {
    this.ligada = false;
  }
}