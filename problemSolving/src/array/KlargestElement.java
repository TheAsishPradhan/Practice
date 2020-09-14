package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 *return K Largest Elements of a given array as an array
 * eg: [ 223, 2, 66, 3, 43 ]
 * if k = 2 return [66, 223]
 * Asish Pradhan
 * Last Modified: 14th Sept 2020
 * */

public class KlargestElement {

	public static void main(String[] args) {
		int[] theArr = { 223, 2, 66, 3, 43 };
		int[] foo = klargest(theArr, 5, 2);
	}

	static int[] klargest(int[] arr, int n, int k) {
		if (k > n) {
			System.out.println("Size of K exceeds size of Array");
			return null;
		}
		Arrays.sort(arr);
		ArrayList<Integer> al = new ArrayList<>();
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (count == k) {
				break;
			}
			al.add(arr[i]);
			count++;
		}
		Collections.sort(al);
		int[] ret = new int[al.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = al.get(i).intValue();
		}
		return ret;
	}

}
