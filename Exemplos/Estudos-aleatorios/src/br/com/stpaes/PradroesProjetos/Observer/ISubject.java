package br.com.stpaes.PradroesProjetos.Observer;

public interface ISubject {

    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}
