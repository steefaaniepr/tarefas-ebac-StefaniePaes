package br.com.stpaes;

import javax.management.Notification;

public class Demo {

    public static void main(String[] args) {
        INotificacao notificacaoEmail = new NotificacaoEmail();
        Usuario usuario = new Usuario(notificacaoEmail);
        usuario.enviarMensagem("Olá, você tem uma nova mensagem!");

        INotificacao notificacaoSMS = new NotificacaoSMS();
        usuario = new Usuario(notificacaoSMS);
        usuario.enviarMensagem("Olá, você tem um novo SMS!");
    }
}
