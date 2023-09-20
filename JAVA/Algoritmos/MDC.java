public class MDC {

    public static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calcularMDC(b, a % b);
    }

    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int mdc = calcularMDC(a, b);
        System.out.println("o MDC dos numeros e :" + mdc);
    }
}