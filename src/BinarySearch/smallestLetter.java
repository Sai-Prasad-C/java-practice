package BinarySearch;

public class smallestLetter {
    static void main(String[] args) {

    }
    static char smallestLetterGreaterThan(char[] arr, char target){
        int start = 0, end = arr.length - 1, result = 0;
        while (start <= end){
            int mid = (start + end)/2;
            if(arr[mid] > target){
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        result = result % arr.length;
        return arr[result];
    }
}
