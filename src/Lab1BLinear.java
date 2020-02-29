

/*Questions
	Should I write the code in a diffrent class?
	Should I ask for user imput?


*/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Lab1BLinear {

	public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int key;
		int[] nums = {1, 4, 4, 22, -5, 10, 21, -47, 23};
		int data[] = new int[20];
		data = fillRand(data);

		System.out.print("key: ");
		key = stdin.nextInt();
        System.out.println("Found " + "\"" + key + "\"" + " for nums Array at index: " + linearSearch(key, nums));
        if(linearSearch(key, data) != -1) {
            System.out.println("Found " + "\"" + key + "\"" + " for data Array at index: " + linearSearch(key, data));
        }
        else {
            System.out.println("Value not found in the data array");
        }

	}
	private static int linearSearch (int key, int[] arry) {
		for (int i=0; i < arry.length; i++) {
				if(arry[i] == key) {
					return i;
				}
		}
		return -1;
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
