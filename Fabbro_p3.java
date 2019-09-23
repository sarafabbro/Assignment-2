import java.util.Scanner;
public class Fabbro_p3 {
	public static void main(String[] args) {
		//Scanner to get user input
		Scanner scn = new Scanner(System.in);
		//Topics is one dimensional array
		String[] topics = new String[5];
		topics[0] = "Environmental Issues";
		topics[1] = "Animal Welfare";
		topics[2] = "Social Issues";
		topics[3] = "American Football";
		topics[4] = "Mental Health";
		//Responses is a two dimensional array
		int[][] responses = new int[5][11];
		//We need to populate the responses array with 0 values, so we can add to them when people respond in certain ways
		int i;
		int j;
		for (i=0; i<5; ++i) {
			for(j=0; j<11; ++j) {
				responses[i][j] = 0;
			}
		}
		//We will use a while loop so multiple people can input their answers
		char userDecision='a';
		int iterations = 0;
		while (userDecision!='n') {
			iterations ++;
			for(i=0; i<5; ++i) {
				System.out.println("Please rate this issue " + topics[i] + ": ");
				int rating = scn.nextInt();
				responses[i][rating] = responses[i][rating]+1;
			}
			System.out.println("Do you want to continue? (Put \"n\" to quit)");
			userDecision = scn.next().charAt(0);
		}
		//Now we need to find the average rating for each issue, the issue with the highest ratings, and the issue with the lowest ratings
		int[] avg = new int[5];
		String minIssue = null;
		String maxIssue = null;
		int max=-999;
		int min=999;
		for(i=0; i<5; ++i) {
			int points = 0;
			for(j=0; j<11; ++j) {
				points += j*responses[i][j];
				if(points>max) {
					max = points;
					maxIssue=topics[i];
				}
				else if(points<min) {
					min = points;
					minIssue=topics[i];
				}
				avg[i] = points/iterations;
				System.out.print(avg[i] + " ");
			}
			System.out.println("");
		}
		System.out.println(maxIssue + " got " + max + " points. " + minIssue + " got " + min + " points.");
	}
}
