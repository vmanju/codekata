package recursion;

import java.util.Arrays;

public class Inversion {

	static int inversionCount(int[] a) {
		if (a.length <= 1)
			return 0;

		int index = a.length / 2;

		int[] leftArray = Arrays.copyOfRange(a, 0, index);
		int[] rightArray = Arrays.copyOfRange(a, index, a.length);

		return inversionCount(leftArray) + inversionCount(rightArray)
				+ merge(a, leftArray, rightArray);
	}

	static int merge(int arr[], int[] left, int[] right) {
		int l = 0, r = 0, inv = 0;
		while (l < left.length || r < right.length) {
			if (l == left.length) {
				arr[l + r] = right[r];
				r++;
			} else if (r == right.length) {
				arr[l + r] = left[l];
				l++;
			} else if (left[l] > right[r]) {
				arr[l + r] = right[r];
				inv += (left.length - l);
				r++;
			} else if (left[l] <= right[r]) {
				arr[l + r] = left[l];
				l++;
			}
		}
		return inv;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(inversionCount(new int[]{2,4,3,1,5,0}));
		System.out.println(inversionCount(new int[]{0,1,2}));
	}

}
