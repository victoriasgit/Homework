public class MyAppIntegral {

    public static void main(String args[]) {
        System.out.println("By rectangles: " + calculateIntRectangle(0, 2, 100, new Function() ) );
        System.out.println("By trapezes: " + calculateIntTrapeze(0, 2, 100, new Function() ) );
        System.out.println("By the method of Simpson: " + calculateIntSimpson(0, 2, 100, new Function() ) );
    }

    private static float calculateIntegralByRectangle(float a, float b, int n, Function function) {
        float sum = 0;
        float dx = (b - a) / n;
        for ( float i = a ; i <= b ; i += dx ) {
            sum += function.calculate(i) * dx;
        }
        sum *= dx;
        return sum;
    }

    private static float calculateIntegralByTrapeze(float a, float b, int n, Function function) {
        float sum = 0;
        float dx = (b - a) / n;
        for ( float i = a ; i < b ; i += dx ) {
            sum += ( function.calculate(i += dx) + function.calculate(i) ) / 2;
        }
        sum *= dx;
        return sum;
    }

    private static float calculateIntegralBySimpson(float a, float b, int n, Function function) {
        float sum = 0;
        float dx = (b - a) / (2 * n);
        float sumEven = 0;
        float sumOdd = 0;
        for ( float i = a + (2 * dx) ; i <= b - (2 * dx) ; i += 2*dx ) {
            sumEven += function.calculate(i);
        }
        for ( float i = a + dx ; i < b ; i += 2*dx ) {
            sumOdd += function.calculate(i);
        }
        sum += function.calculate(a) + function.calculate(b) + 2 * sumEven + 4 * sumOdd;
        sum *= (dx / 3);
        return sum;
    }
}