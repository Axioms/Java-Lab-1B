
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lab1BBinary {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int key;
        int[] nums = {1, 4, 4, 22, -5, 10, 21, -47, 23};
        int[] data = new int[20];
        data = fillRand(data);
        Arrays.sort(data);
        Arrays.sort(nums);
        System.out.print("key: ");
        key = stdin.nextInt();
        System.out.println(binarySearch(nums, key, 0, nums.length -1));
        System.out.println(binarySearch(data, key, 0, data.length -1));
    }
    private static int binarySearch(int[] arry, int key, int start, int end) {
        int mid = (start + end) / 2;
        if (end >= start) {

            if(arry[mid] > key) {
                return binarySearch(arry, key, start, mid -1);
            }
            else if(arry[mid] < key) {
                return  binarySearch(arry, key, mid + 1, end);
            }
            else{
                return mid;
            }
        }

        return -(mid + 1);
    }
    private static int[] fillRand (int[] data) {
        /*From my lab one a*/
        Random rnd = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(200 + 1) - 100;
        }
        return data;
    }
}
