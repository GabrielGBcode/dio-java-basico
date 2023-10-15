package mensagem.apps;

public class FacebookMessenger extends ServicoMensagemInsta {

  public void enviarMensagem() {
    validarConexao();
    System.out.println("Enviando mensagem pelo Facebook");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo Facebook");
  }

}
