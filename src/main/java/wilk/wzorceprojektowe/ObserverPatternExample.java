package wilk.wzorceprojektowe;

import java.util.ArrayList;
import java.util.List;

// Interfejs Observer, który definiuje metodę do aktualizacji obiektu na podstawie zmiany stanu
interface Observer {
    void update(String message);
}

// Klasa konkretnego obiektu, który implementuje interfejs Observer
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

// Interfejs Subject, który definiuje metody do dodawania, usuwania i powiadamiania obserwatorów
interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}

// Klasa konkretnego obiektu, który implementuje interfejs Subject
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Metoda do symulowania zmiany stanu obiektu
    public void changeState(String newState) {
        System.out.println("Subject's state changed to: " + newState);
        notifyObservers("State changed to: " + newState);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Użycie wzorca Observer
        ConcreteSubject subject = new ConcreteSubject();

        // Dodanie obserwatorów
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Symulacja zmiany stanu obiektu
        subject.changeState("New State");

        // Usunięcie jednego z obserwatorów
        subject.removeObserver(observer1);

        // Kolejna symulacja zmiany stanu obiektu
        subject.changeState("Another State");
    }
}
