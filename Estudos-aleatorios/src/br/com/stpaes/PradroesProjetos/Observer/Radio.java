package br.com.stpaes.PradroesProjetos.Observer;

public class Radio implements IObserver {

    @Override
    public void update(ISubject subject) {
        if (subject instanceof Jornalista) {
            Jornalista jornalista = (Jornalista) subject;
            System.out.println("Notificando mensagem pelo Radio." + jornalista.toString());
        }
    }
}
