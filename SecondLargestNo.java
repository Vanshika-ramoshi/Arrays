package arrays;

public class SecondLargestNo {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 50 };

		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
	else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];

			}

		}
		System.out.println("The second largest number :" + secondLargest);
	}

}
//	    public static void main(String[] args) {
//
//	        int[] arr = {10, 25, 5, 40, 30};
//
//	        int largest = arr[0];
//	        int secondLargest = arr[0];
//
//	        for (int i = 1; i < arr.length; i++) {
//
//	            if (arr[i] > largest) {
//	                secondLargest = largest;
//	                largest = arr[i];
//	            }
//	            else if (arr[i] > secondLargest && arr[i] != largest) {
//	                secondLargest = arr[i];
//	            }
//	        }
//
//	        System.out.println("Second largest: " + secondLargest);
//	    }
//	}