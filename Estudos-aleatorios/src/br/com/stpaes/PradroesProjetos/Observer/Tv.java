package br.com.stpaes.PradroesProjetos.Observer;


public class Tv implements IObserver {


    @Override
    public void update(ISubject subject) {
        if (subject instanceof Jornalista) {
            Jornalista jornalista = (Jornalista) subject;
            System.out.println("Notificando mensagem pela TV" + jornalista.toString());
        }
    }
}
