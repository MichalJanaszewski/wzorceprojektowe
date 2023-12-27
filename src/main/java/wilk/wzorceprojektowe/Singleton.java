package wilk.wzorceprojektowe;

public class Singleton {

    // Prywatne statyczne pole przechowujące jedyną instancję klasy
    private static Singleton instance;

    // Prywatny konstruktor, aby uniemożliwić tworzenie instancji z zewnątrz
    private Singleton() {
        // Inicjalizacja instancji (jeśli wymagane)
    }

    // Metoda publiczna do uzyskiwania instancji klasy
    public static Singleton getInstance() {
        // Jeśli instancja nie istnieje, utwórz ją
        if (instance == null) {
            instance = new Singleton();
        }
        // Zwróć istniejącą instancję
        return instance;
    }

    // Metody i pola klasy Singleton

    public void someMethod() {
        // Implementacja metody
    }
}