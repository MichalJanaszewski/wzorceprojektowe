package wzorceprojektowe.SingletonPattern;

public class SingletonPatternExample {
    public static void main(String[] args) {

        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        if (firstInstance == secondInstance) {
            System.out.println("\nObie instancje są identyczne.\n");
        } else {
            System.out.println("\nObie instancje NIE są identyczne.\n");
        }
    }
}
