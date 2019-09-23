import java.util.Scanner; 
public class Fabbro_p1reverse {
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
		
		//If the number is less than 7 we have to add 3. If the number is 7 or greater, we have to subtract 7.
		for(i=0; i<4; ++i) {
			if (data[i]<7) {
				data[i] = data[i] + 3;
			}
			else {
				data[i] = data[i] - 7;
			}
		}
		
		//Now we print the decrypted data
		for(i=0; i<4; ++i) {
			System.out.print(data[i]);
		}
	}
}