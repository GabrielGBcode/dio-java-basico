package xerox.estabelecimento;

import xerox.equipamentos.copiadora.Copiadora;
import xerox.equipamentos.digitalizadora.Digitalizadora;
import xerox.equipamentos.impressora.Deskjet;
import xerox.equipamentos.impressora.Impressora;
import xerox.equipamentos.impressora.Laserjet;
import xerox.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora imp = em;
    Digitalizadora dig = em;
    Copiadora cop = em;

    imp.imprimir();
    dig.digitalizar();
    cop.copiar();
  }
}
