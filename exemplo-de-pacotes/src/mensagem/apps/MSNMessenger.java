package mensagem.apps;

public class MSNMessenger extends ServicoMensagemInsta {
  public void enviarMensagem() {
    validarConexao();
    System.out.println("Enviando mensagem pelo MSN");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN");
  }

}
