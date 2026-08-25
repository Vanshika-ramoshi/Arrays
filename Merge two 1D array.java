package arrays;

public class Frequency {

	public static void main(String[] args) {
//int[] arr3 = {1,2,3,4,5,6,7,8};
//
    int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };

		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[arr1.length + j] = arr2[j];
		}
		for (int k = 0; k < arr3.length; k++) {
        			System.out.println(arr3[k]);
		}

	}

}
