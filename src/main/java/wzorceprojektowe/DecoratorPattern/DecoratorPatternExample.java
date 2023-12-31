package wzorceprojektowe.DecoratorPattern;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Component decoratedA = new ConcreteDecorator(component);
        Component decoratedB = new DifferentConcreteDecorator(decoratedA);

        component.operation();
        System.out.println("-----------");
        decoratedA.operation();
        System.out.println("-----------");
        decoratedB.operation();
    }
}
