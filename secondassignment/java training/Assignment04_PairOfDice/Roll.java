/*Pair of Dice Game*/
/*This program will allow the user to display the result of throwing 2 dice.*/


import java.util.Scanner;


public class Roll {
	
		private static int dice;

		public static void Toss() {
		
			dice = (int) (Math.random() * 6.9); 
			if (dice==0) {
				dice++;
			}
			System.out.println(dice);

		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press any key to throw a pair of dice and press Enter (or Q and Enter to quit)");
        
		String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q") || 
                input.equalsIgnoreCase("Q")) {
            System.out.println("Bye!");
            scanner.close();
            return;
        }
        else {
        System.out.print("First Dice: ");
        Toss();
        System.out.print("Second Dice: ");
        Toss();
        }
		
        while(true) {
        System.out.println("Play Again? Enter any key if yes or Q and Enter to Quit");
		String input2 = scanner.nextLine();
        if (input2.equalsIgnoreCase("q") || 
                input2.equalsIgnoreCase("Q")) {
            System.out.println("Bye!");
            scanner.close();
            return;
        }
        else {
        	 System.out.print("First Dice: ");
             Toss();
             System.out.print("Second Dice: ");
             Toss();
        }
        
        
        }

	}

}
