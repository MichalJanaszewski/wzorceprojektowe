package wzorceprojektowe.DecoratorPattern;

class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}