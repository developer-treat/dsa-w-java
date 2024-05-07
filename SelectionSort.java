public class SelectionSort {

    void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min_index = arr[i];
            // finding min element of arr
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    void print_arr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 23, 34, 56, 12, 67, 45, 34 };
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        System.out.println("Sorted array with selection sort : ");
        ob.print_arr(arr);
    }
}
