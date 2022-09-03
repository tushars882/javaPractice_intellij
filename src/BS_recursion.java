public class BS_recursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 88, 53};
        int target = 88;
        System.out.println(search_Binary(arr, target, 0, arr.length - 1));
    }

    static int search_Binary(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;

        }
        if (target < arr[mid]) {
            return search_Binary(arr, target, start, mid - 1);
        } else {
            return search_Binary(arr, target, mid+1, end);
        }

    }
}
