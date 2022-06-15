public class SelectionSort {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                minValue = arr[j] < arr[minValue] ? j : minValue;
            }
            int tmp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = tmp;

        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int[] aa = {1, 5, 41, 0, 877, 4561, 2, 3};
        SSort(aa);
    }
}
