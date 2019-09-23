import java.util.Scanner;
public class Fabbro_p2 {
	public static void main(String[] args) {
		//Scanner to get user input
		Scanner scn = new Scanner(System.in);
		//We need variables for units, height, weight, and BMI
		int unit;
		double height;
		double weight;
		double BMI;
		//See if user will enter in pounds or kilograms
		System.out.println("Will you be using US(inches/lb) or Metric(meters/kilograms) units? (Please enter \"1\" for US or \"2\" for metric)");
		unit = scn.nextInt();
		//Make sure user enters one of these before continuing
		while (unit>2||unit<1) {
			System.out.println("Please enter \"1\" for US or \"2\" for metric");
			unit = scn.nextInt();
		}
		//Use the first if statement for US measurements, get values from user
		if (unit==1) {
			System.out.println("Please enter your height in inches: ");
			height = scn.nextDouble();
			System.out.println("Please enter your weight in pounds: ");
			weight = scn.nextDouble();
			BMI = (703*weight)/(height*height);
		}
		//Use the else statement for metric measurements. get values from user
		else {
			System.out.println("Please enter your height in meters: ");
			height = scn.nextDouble();
			System.out.println("Please enter your weight in kilograms: ");
			weight = scn.nextDouble();
			BMI = (weight)/(height*height);
		}
		//Print out BMI
		System.out.println("Your BMI is: " + BMI + "\n");
		//Print out the BMI chart
		System.out.println("Here are the BMI Categories: ");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}
}
