package xerox.equipamentos.multifuncional;

import xerox.equipamentos.copiadora.Copiadora;
import xerox.equipamentos.digitalizadora.Digitalizadora;
import xerox.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  public void copiar() {
    System.out.println("Copiando via equipamento multifuncional");
  }

  public void imprimir() {
    System.out.println("Imprimindo via equipamento multifuncional");
  }

  public void digitalizar() {
    System.out.println("Digitalizando via equipamento multifuncional");
  }

}
