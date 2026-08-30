package arrays;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int[] arr = {121, 888, 1233, 5678, 407};

		for (int i = 0; i < arr.length; i++) {
		    int num = arr[i];
		    int original = num;
		    int sum = 0;

		    while (num > 0) {
		        int m1 = num % 10;
		        sum = sum + (m1* m1 * m1);
		        num = num / 10;
		    }

		    if (sum == original) {
		        System.out.println(original+" isArmstrong");
		    } else {
		        System.out.println(original+"is not Armstrong");
		    }
		}
	}
}
-----------------------------------------------------------------------
  OUTPUT :
121is not Armstrong
370 isArmstrong
153 isArmstrong
5678is not Armstrong
407 isArmstrong
