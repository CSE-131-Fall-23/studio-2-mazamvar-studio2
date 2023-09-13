package studio2;

import java.util.Scanner;

public class Ruin {
	
	public static void main (String[] args) {
		double startAmount;
		double winChance = 0.9;
		double winLimit = 50;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are at the ZAMMA Casino");
		//pause = scanner.next();
		
		System.out.print("Please enter how much money you are starting with: $");
		startAmount = scanner.nextDouble();
		
		System.out.println("How many days do you want to go to the casino: ");
		
		
		double totalWins = 0;
		double numDays = scanner.nextInt();

		
		
		int count = 0;
		
		while( count <= numDays) {

			double winning = startAmount;
			count++;
			int dayCount = 0;
			
			while (winning < winLimit && winning != 0) {
				
				if(Math.random()>winChance) {
					winning++;
					dayCount++;
					//System.out.println("You won $1");
				}
				else {
					winning--;
					//System.out.println("You lost $1");
				}
				//totalSimulation++;
				//System.out.println("After round " + totalSimulation + " your balance is " + startAmount);
			}

			if (winning == winLimit) {
				totalWins++;
			}
			
			if (winning == winLimit) {
				System.out.println("Simulation " + count + ": "+ dayCount+" wins: WIN");
			}
			else
				System.out.println("Simulation "  + count + ": "+ dayCount+" wins: LOSS");
			
		}
		
		System.out.println("In the total " +Math.round(numDays) + " that you gambled, you won " + Math.round(totalWins) + " number of days.");
		System.out.println("Ruin rate from simulation: " + (1-(totalWins/numDays)) + " Expected ruin rate from simulation: "+ winChance );
		
	}
}
