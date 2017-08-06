import java.util.*;

class MergeSort {
	public static void main(String[] args) {
		int ar1[] = {1,3,5, 5, 234, 654, 888};
		int ar2[] = {2,4,6,8,10,11,34};
		int ar3[] = new int[ar1.length + ar2.length];
		int i = 0, j = 0, k = 0;
		while( i < ar1.length && j < ar2.length ) {
			if (ar1[i] <= ar2[j]){
				ar3[k++] = ar1[i++];
			} else {
				ar3[k++] = ar2[j++];
			}
		}

		if (i == ar1.length) {
			while (j < ar2.length) {
				ar3[k++] = ar2[j++];
			}
		}

		if (j == ar2.length) {
			while (i < ar1.length) {
				ar3[k++] = ar1[i++];
			}
		}

		System.out.println(Arrays.toString(ar3));
	}
}
