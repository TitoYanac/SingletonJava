import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Double, String> timeType = new TreeMap<Double, String>();

        timeType.put(compararSingleton("normal"), "normal");
        timeType.put(compararSingleton("sincronized"), "sincronized");
        timeType.put(compararSingleton("static1"), "static1");
        timeType.put(compararSingleton("static2"), "static2");
        timeType.put(compararSingleton("inner"), "inner");

        Iterator<Double> it = timeType.keySet().iterator();
        while (it.hasNext()) {
            Double key = it.next();
            System.out.println("Tiempo: " + key + " -> Tipo: " + timeType.get(key));
        }
    }

    private static double compararSingleton(String type) {

        long startTime = System.nanoTime();

        switch (type) {
            case "normal":
                SingletonNormal a1 = SingletonNormal.getInstance();
                SingletonNormal a2 = SingletonNormal.getInstance();
                System.out.println("< " + type + " > " + a1 + " == " + a2 + " : " + (a1 == a2));
                break;
            case "sincronized":
                SingletonSincronized b1 = SingletonSincronized.getInstance();
                SingletonSincronized b2 = SingletonSincronized.getInstance();
                System.out.println("< " + type + " > " + b1 + " == " + b2 + " : " + (b1 == b2));

                break;
            case "static1":
                SingletonStaticType1 c1 = SingletonStaticType1.getInstance();
                SingletonStaticType1 c2 = SingletonStaticType1.getInstance();
                System.out.println("< " + type + " > " + c1 + " == " + c2 + " : " + (c1 == c2));

                break;
            case "static2":
                SingletonStaticType2 d1 = SingletonStaticType2.getInstance();
                SingletonStaticType2 d2 = SingletonStaticType2.getInstance();
                System.out.println("< " + type + " > " + d1 + " == " + d2 + " : " + (d1 == d2));

                break;
            case "inner":
                SingletonInnerForm e1 = SingletonInnerForm.getInstance();
                SingletonInnerForm e2 = SingletonInnerForm.getInstance();
                System.out.println("< " + type + " > " + e1 + " == " + e2 + " : " + (e1 == e2));

                break;

            default:
                break;
        }

        long endTime = System.nanoTime() - startTime;
        return endTime;

    }

}
