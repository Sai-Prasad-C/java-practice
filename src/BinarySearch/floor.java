package BinarySearch;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class floor {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 5, 9, 14, 16, 18));
        int tar = 16;
        System.out.println(findFloor(arr, tar));
    }
    static int findFloor(ArrayList<Integer> arr, int target){
        int start = 0, end = arr.size() - 1, result = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if (arr.get(mid) == target) return mid;
            else if (target > arr.get(mid)){
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
