import java.util.*;

class MergeSort {
	public static void main(String[] args) {
		int ar1[] = {1,3,5, 5, 234, 654, 888};
		int ar2[] = {2,4,6,8,10,11,34};
		System.out.println(Arrays.toString(merge2Arrays(ar1, ar2)));
		System.out.println(Arrays.toString(merge2Arrays(null, ar2)));
		System.out.println(Arrays.toString(merge2Arrays(null, null)));

		System.out.println("-------------------------------------");
		int mergedSortedArrays1[] = {1,3,5, 5, 234,654,888, 2,4,6,8,10,11,34};
		int start = 0, mid = 6, end = 13;
		int result[] = sortMergedSortedArrays(mergedSortedArrays1, start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays2[] = {2,1};
		start = 0; mid = 0; end = 1;
		result = sortMergedSortedArrays(mergedSortedArrays2, start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays3[] = {2,3,1};
		start = 0; mid = 1; end = 2;
		result = sortMergedSortedArrays(mergedSortedArrays3, start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays4[] = {2};
		start = 0; mid = 0; end = 0;
		result = sortMergedSortedArrays(mergedSortedArrays4, start, mid, end);
		System.out.println(Arrays.toString(result));

		System.out.println("-------------------------------------");
		int mergedSortedArrays5[] = null;
		start = 0; mid = 0; end = 0;
		result = sortMergedSortedArrays(mergedSortedArrays5, start, mid, end);
		System.out.println(Arrays.toString(result));
	}

	/* 
	 Length of array1 is m
	 Length of array2 is n
	 Space complexity is m + n
	 Time complexity 
		 O(m + n)
	*/

	private static int[] merge2Arrays(int ar1[], int ar2[]){
		if (ar1 == null) ar1 = new int[0];
		if (ar2 == null) ar2 = new int[0];

		int i = 0, j = 0, k = 0;
		int ar3[] = new int[ar1.length + ar2.length];
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
		return ar3;
	}

	/* 
		Problem part 2 :
			int ar1[] = {1,3,5, 5, 234,654,888, 2,4,6,8,10,11,34};
			start = 0, mid = 6, end	= 13
			[1, 2, 3, 4, 5, 5, 6, 8, 10, 11, 34, 234, 654, 888]

	*/ 

	private static int[] sortMergedSortedArrays(int ar[], int start,int mid,int end){
		if(ar == null){
			throw new IllegalArgumentException("Array should not be null");
		}
		int sortedArray[] = new int[(end - start) + 1];
		int sortedArrayIndex = 0;
		int i = start, j = mid + 1;
		while (i <= mid && j <= end) {
			if (ar[i] <= ar[j]) {
				sortedArray[sortedArrayIndex++] = ar[i++];
			} else {
				sortedArray[sortedArrayIndex++] = ar[j++];
			}
		}

		while (j < end) {
			sortedArray[sortedArrayIndex++] = ar[j++];
		}

		while (i <= mid) {
			sortedArray[sortedArrayIndex++] = ar[i++];
		}
		return sortedArray;
	}
}
