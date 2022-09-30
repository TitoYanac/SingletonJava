public class SingletonNormal {
    private static SingletonNormal instance;

    private SingletonNormal() {
    }

    public static SingletonNormal getInstance() {
        if (instance == null) {
            instance = new SingletonNormal();
        }
        return instance;
    }
}
