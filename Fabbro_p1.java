import java.util.Scanner; 
public class Fabbro_p1 {
	public static void main(String[] args) {
		//Scanner to get user input
		Scanner scn = new Scanner(System.in);
		//The data will be in an array since we have to manipulate each number separately
		int[] data = new int[4];
		//We will user i to increment our loops
		int i;
		
		//Get data from user
		for(i=0; i<4; ++i) {
			System.out.print("Enter number " + (i+1) + ":");
			data[i] = scn.nextInt();
		}
		//We need to add seven to each digit
		for(i=0; i<4; ++i) {
			data[i] = data[i] + 7;
		}
		//Now we need to find the remainder after dividing each digit by 10
		for(i=0; i<4; ++i) {
			data[i] = data[i]%10;
		}
		
		//Now we need to switch the 1st and 3rd digits and the 2nd and 4th digits
		//First we will need a temporary location
		int temp;
		//Then we will use this to switch digits 1 and 3
		temp = data[0];
		data[0] = data[2];
		data[2] = temp;
		//Now we will switch digits 2 and 4
		temp = data[1];
		data[1] = data[3];
		data[3] = temp;
		
		//Now we print the encrypted data
		for(i=0; i<4; ++i) {
			System.out.print(data[i]);
		}
	}
}