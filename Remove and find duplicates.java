package arrays;

public class Frequency {

	public static void main(String[] args) {
//remove duplicatess
    int[] num = {1,2,2,2,3,4,4,5,6,6,5 };
		int[] result = new int[num.length];
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			boolean dublicate = false;
			for (int j = 0; j < count; j++) {
				if (num[i] == result[j]) {
					dublicate = true;
					break;
				}
			}
			if (!dublicate) {
				result[count] = num[i];
				count++;
			}
		}
		for (int k = 0; k < count; k++) {
			System.out.println(result[k]);
		}

		//find duplicates
		int[] num = {1,2,2,2,3,4,4,5,6,6,5 };
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j <num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("duplicates = "+num[i]);
				}
			}
		}
	}

}
