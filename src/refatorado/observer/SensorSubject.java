package refatorado.observer;

import java.util.ArrayList;
import java.util.List;

public class SensorSubject {
    private final List<SensorObserver> observers = new ArrayList<>();

    public void adicionarObserver(SensorObserver observer) {
        observers.add(observer);
    }

    public void notificarObservers() {
        for (SensorObserver observer : observers) {
            observer.atualizar();
        }
    }
}
