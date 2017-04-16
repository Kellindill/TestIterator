import java.util.Iterator;

public class TestClassTypes {

    public static void main(String[] args) {

        LinkedList<Double> temperatures = new LinkedList<>();

        for(int i = 0; i < 6; i++) {
            temperatures.addItem(25.0*Math.random());
        }

        Iterator<Double> iter = temperatures.iterator();
        while (iter.hasNext()) {
            System.out.println("iter: " + iter.next());
        }

        for(Double value : temperatures) {
            System.out.printf("%.2f degrees Fahrenheit%n", toFahrenheit(value));
        }
    }

    private static double toFahrenheit(double value) {
        return 1.8*value + 32.0;
    }
}
