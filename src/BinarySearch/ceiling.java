package BinarySearch;
import java.util.Scanner;
import java.util.Arrays;

public class ceiling {
    static void main(String[] args) {
    int[] arr = {2, 3, 5, 9, 14, 16, 18};
    int tar = 6;
    System.out.println(findCeiling(arr,tar));
    }
    static int findCeiling(int[] arr, int target){
        int start = 0, end = arr.length - 1, result = -1;;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target) return mid;
            else if (target < arr[mid]){
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
