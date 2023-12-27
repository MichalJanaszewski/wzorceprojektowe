package wilk.wzorceprojektowe;

// Komponent - interfejs reprezentujący bazowy obiekt
interface Component {
    void operation();
}

// Konkretny komponent - implementacja interfejsu Component
class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

// Dekorator - abstrakcyjna klasa, która implementuje interfejs Component
abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

// Konkretny dekorator - dodaje nową funkcjonalność do obiektu
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("ConcreteDecoratorA added behavior");
    }
}

// Inny konkretny dekorator - dodaje inną funkcjonalność
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("ConcreteDecoratorB added behavior");
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Użycie wzorca Decorator
        Component component = new ConcreteComponent();
        
        // Dekorowanie obiektu różnymi dekoratorami
        Component decoratedA = new ConcreteDecoratorA(component);
        Component decoratedB = new ConcreteDecoratorB(decoratedA);

        // Wywołanie operacji na dekorowanych obiektach
        component.operation();
        System.out.println("-----------");
        decoratedA.operation();
        System.out.println("-----------");
        decoratedB.operation();
    }
}
