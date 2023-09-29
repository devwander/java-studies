package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    System.out.println("COPIANDO MULTI");
    
  }

  @Override
  public void digitalizar() {
    System.out.println("DIGITALIZANDO MULTI");
  }

  @Override
  public void imprimir() {
    System.out.println("IMPRIMINDO MULTI");
  }

}
