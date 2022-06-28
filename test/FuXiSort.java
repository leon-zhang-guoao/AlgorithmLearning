public class FuXiSort {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minindex = arr[j] < arr[minindex] ? j : minindex;
            }
            if (minindex != i) {
                swap(arr, i, minindex);
            }
        }
        printArr(arr);
    }

    public static void buddleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    swap(arr, j, j + 1);
                }

            }

        }
        printArr(arr);
    }

    public static void insertSory(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        printArr(arr);

    }

    public static void main(String[] args) {

        int[] arr = {5, 0, 1, 45, 564, 35, 8979, 3545, -5};
        printArr(arr);
        System.out.println(" ");
        insertSory(arr);

    }
}
