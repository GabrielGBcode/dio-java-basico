package mensagem;

public class ComputadorMain {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
