public class SingletonSincronized {

    private static SingletonSincronized instance;

    private SingletonSincronized() {
    }

    public static synchronized SingletonSincronized getInstance() {
        if (instance == null) {
            instance = new SingletonSincronized();
        }
        return instance;
    }
}