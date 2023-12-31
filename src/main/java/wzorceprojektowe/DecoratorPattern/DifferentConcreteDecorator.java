package wzorceprojektowe.DecoratorPattern;

class DifferentConcreteDecorator extends Decorator {
    public DifferentConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("DifferentConcreteDecorator added behavior");
    }
}
