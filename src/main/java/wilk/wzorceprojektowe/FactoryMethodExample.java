package wilk.wzorceprojektowe;

// Interfejs Product reprezentujący obiekt, który zostanie utworzony
interface Product {
    void display();
}

// Konkretna implementacja interfejsu Product
class ConcreteProduct implements Product {
    @Override
    public void display() {
        System.out.println("ConcreteProduct displayed.");
    }
}

// Interfejs Factory definiujący metodę factoryMethod, która zostanie zaimplementowana przez konkretne fabryki
interface Factory {
    Product createProduct();
}

// Konkretna implementacja interfejsu Factory
class ConcreteFactory implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        // Użycie wzorca Factory Method
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.display();
    }
}