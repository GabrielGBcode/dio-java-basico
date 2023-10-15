package mensagem.apps;

public abstract class ServicoMensagemInsta {
  public abstract void enviarMensagem();

  public abstract void receberMensagem();

  protected void validarConexao() {
    System.out.println("Validando se está conectado à internet!");
  };
}
