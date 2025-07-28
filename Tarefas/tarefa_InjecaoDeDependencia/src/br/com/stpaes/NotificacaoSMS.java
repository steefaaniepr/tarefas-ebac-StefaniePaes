package br.com.stpaes;

public class NotificacaoSMS implements INotificacao {


    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
