package br.com.stpaes;

public class Usuario {

    private INotificacao notificacao;

    public Usuario(INotificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void enviarMensagem(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
