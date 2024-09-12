package msn_messenger;

public class Messenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistorioMensagem();
    }
    public void receberMensagem(){
        validarConectadoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistorioMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistorioMensagem() {
        System.out.println("Salvando o histórico de mensagens");
    }
}
