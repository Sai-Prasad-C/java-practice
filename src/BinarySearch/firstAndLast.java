package BinarySearch;
import java.util.Arrays;

public class firstAndLast {
    static void main(String[] args) {
        int[] arr = {1,2,3,3,3,5,6,7};
        int tar = 3;
        System.out.println(Arrays.toString(findFirstAndLast(arr,tar)));
        System.out.println(Arrays.toString(searchRange(arr,tar)));
    }
    static int[] findFirstAndLast(int[] arr, int target) {
        int start = 0, last = arr.length - 1;
        int[] res = {-1, -1};
        while (start <= last) {
            if (arr[start] == target && arr[last] == target) {
                res = new int[]{start,last};
                break;
            }
            if (arr[start] != target) start++;
            if (arr[last] != target) last--;
        }
        return res;
    }

    static int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums,target,true),binarySearch(nums,target,false)};
    }

    static int binarySearch(int[] arr,int target, boolean lowest){
        int start = 0, last = arr.length;
        if (lowest) {
            while (start < last) {
                int mid = (start + last) / 2;
                if (target <= arr[mid]) {
                    last = mid;
                } else {
                    start = mid + 1;
                }
            }
            if (last < arr.length && arr[last] == target) {
                return last;
            }
            return -1;
        } else {
            while (start < last) {
                int mid = (start + last) / 2;
                if (target < arr[mid]) {
                    last = mid;
                } else {
                    start = mid + 1;
                }
            }
            int result = start - 1;
            if (result >= 0 && arr[result] == target) {
                return result;
            }
            return -1;
        }
    }
}
