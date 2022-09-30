public class SingletonStaticType1 {

    private static final SingletonStaticType1 instance = new SingletonStaticType1();

    private SingletonStaticType1() {
    }

    public static SingletonStaticType1 getInstance() {
        return instance;
    }
}