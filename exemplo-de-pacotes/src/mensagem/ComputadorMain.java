package mensagem;

import mensagem.apps.FacebookMessenger;
import mensagem.apps.MSNMessenger;
import mensagem.apps.ServicoMensagemInsta;
import mensagem.apps.TelegramMessenger;

public class ComputadorMain {
    public static void main(String[] args) {
        ServicoMensagemInsta smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlm")) {
            smi = new TelegramMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
