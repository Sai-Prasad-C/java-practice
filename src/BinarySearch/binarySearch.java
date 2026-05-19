package BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class binarySearch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = -121;
        System.out.println(bSearch(arr,target));
        }

        static int bSearch(int[] arr, int target){
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + (end - start)/2 ; // (same as start + end)/2
                if (arr[mid] == target) return mid;
                else if (target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }
            return -1;
    }
}
