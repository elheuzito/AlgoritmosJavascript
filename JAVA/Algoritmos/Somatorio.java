public class Somatorio {
        public static int sumArray(int[] arr) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            return sum;
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 7, 9, 5};
            int sum = sumArray(arr);
            System.out.println("O somatorio dos elementos do array e: " + sum);
        }
}
