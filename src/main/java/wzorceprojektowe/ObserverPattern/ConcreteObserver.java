package wzorceprojektowe.ObserverPattern;

class ConcreteObserver implements Observer {
    private String name;
    private String subjectState;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        subjectState = message;
        System.out.println(name + " subject state changed to: " + subjectState);
    }
}
