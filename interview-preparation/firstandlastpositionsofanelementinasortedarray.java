public class firstandlastpositionsofanelementinasortedarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;

        System.out.println("first index "+first(arr, 0, n-1, x, n));
        System.out.println("Last index "+last(arr, 0, n-1, x, n));
    }

    private static int first(int[] arr, int low, int high, int x, int n) {
        if(high >= low){
            int mid = low + (high - low)/2;
            if((mid == 0 || x > arr[mid -1]) && x == arr[mid])
                return mid;
            else if(x > arr[mid])
                return first(arr, mid+1, high, x, n);
            else
                return first(arr, low, mid-1, x, n);
        }
        return -1;
    }

    private static int last(int[] arr, int low, int high, int x, int n) {
        if(high >= low){
            int mid = low + (high - low)/2;
            if((mid == n - 1 || x < arr[mid +1]) && x == arr[mid])
                return mid;
            else if(x < arr[mid])
                return last(arr, low, mid-1, x, n);
            else
                return last(arr, mid+1, high, x, n);
        }
        return -1;
    }
}
