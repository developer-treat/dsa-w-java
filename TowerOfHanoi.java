import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        n = in.nextInt();
        // recursion part
        towerOfHanoi(n, "Source", "Helper", "Destinaton");
    }
}