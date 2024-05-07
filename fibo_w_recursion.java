public class fibo_w_recursion {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return (fibo(n - 1) + fibo(n - 2));
    }

    public static void main(String[] args) {
        int length = 9;
        System.out.println("Fibonacci series " + length + " are : ");
        for (int i = 0; i < length; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    // or
    /*
     * public static void print_fibo(int a, int b, int n) {
     * if (n == 0) {
     * return;
     * }
     * int c = a + b;
     * System.out.println(c);
     * print_fibo(b, c, n - 1);
     * }
     * 
     * public static void main(String[] args) {
     * int a = 0, b = 1;
     * System.out.println(a);
     * System.out.println(b);
     * int n = 7;
     * print_fibo(a, b, n);
     * }
     */
}
