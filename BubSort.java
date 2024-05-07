public class BubSort {

    void bub_sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void print_arr(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 12, 23, 43, 12, 56, 32, 67, 71, 6 };

        BubSort ob = new BubSort();
        ob.bub_sort(arr);
        System.out.print("Sorted array with bubble sort : ");
        ob.print_arr(arr);
    }
}
