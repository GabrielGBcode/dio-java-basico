package mensagem;

public class MSNMessenger {
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Enviar mensagem!");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem!");
    }

    private void validarConectandoInternet() {
        System.out.println("Validando conexão com a internet!");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico  !");
    }
}
