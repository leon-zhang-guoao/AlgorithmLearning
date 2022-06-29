public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void SSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                minValue = arr[j] < arr[minValue] ? j : minValue;
            }
            swap(arr, minValue, i);


        }
        printArr(arr);
    }

    public static void bubbldSory(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }

            }
        }
        printArr(arr);

    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {

            while (i - 1 >= 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
                i--;
            }

        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int[] aa = {1, 5, 41, 0, 877, 4561, 2, 3};
        insertSort(aa);
        //
    }
}