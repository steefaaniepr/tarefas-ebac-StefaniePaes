package br.com.stpaes;

public class NotificacaoEmail implements INotificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
