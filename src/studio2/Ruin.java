package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing variables
		int startAmount,winLimit,totalSimulations;
		int day=0;
		int plays=0;
		double Ruin=0;
		double Success=0;
		double winChance;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Starting Amount:");
		startAmount = scan.nextInt();
		System.out.println("Enter Win Chance:");
		winChance = scan.nextDouble();
		System.out.println("Enter Win Limit:");
		winLimit = scan.nextInt();
		System.out.println("Enter total simulations:");
		totalSimulations=scan.nextInt();
		int initialAmount=startAmount;
		while(day<totalSimulations) {
		while (startAmount<winLimit && startAmount>0){
			if (Math.random()<winChance) {
				startAmount++;
			}
			else {
				startAmount--;
			}
			plays++;
			}
		day++;
		System.out.println("Day #: "+day);
		System.out.println("Number of plays: "+plays);
		if (startAmount>0) {
			System.out.println("Success!");
		Success++;
		}
		else  {
			System.out.println("Ruin):");
		Ruin++;
		}
		plays=0;
		startAmount=initialAmount;
		}
		System.out.println("Wins: " + Success);
		System.out.println("Losses: " +Ruin);	
		double ruinRate = (Ruin/(Success+Ruin));
		System.out.println("This is the Ruin Rate from the simulation: "+ ruinRate);
	}
	

}
