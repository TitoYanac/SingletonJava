public class SingletonStaticType2 {

    private static final SingletonStaticType2 instance;

    static {
        instance = new SingletonStaticType2();
    }

    private SingletonStaticType2() {
    }

    public static SingletonStaticType2 getInstance() {
        return instance;
    }
}