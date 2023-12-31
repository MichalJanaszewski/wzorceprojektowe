package wzorceprojektowe.ObserverPattern;

public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.changeState("New State");

        subject.removeObserver(observer1);

        subject.changeState("Another State");
    }
}
