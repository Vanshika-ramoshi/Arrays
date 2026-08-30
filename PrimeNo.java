package arrays;

public class PrimeNumber {

	public static void main(String[] args) {
	
		//prime no using array 	
//		
//		num[i]%j==0 ---> check the remainder ex. 3%2=1 remainder is 1 this is Prime 
		int[] num = { 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < num.length; i++) {
			boolean isPrime = true;
			if (num[i] <= 1) {
				isPrime = false;

			} else {
				for (int j = 2; j < num[i]; j++) {
					if (num[i] % j == 0) {
						isPrime = false;
						break;

					}
				}
			}
			if (isPrime) {
				System.out.println("Prime number --> " + num[i]);
			}
		}

	}
}
------------------------------------------------------------------------
      OUTPUT :
Prime number --> 2
Prime number --> 3
Prime number --> 5
Prime number --> 7
