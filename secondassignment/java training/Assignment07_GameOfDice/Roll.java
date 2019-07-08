/*Game of Dice*/
/*This program will allow the user to pit their 
luck against the computer in a game of dice throws.*/

import java.util.Scanner;


public class Roll {
	
		private static int dice;
		private static int dice1;
		private static int dice2;	
		private static int dice3;
		private static int dice4;	
		
		 static String[][] RollNames = { 
		    		{" ' ", "  Die 1", "       Die 2", "      Die 3", "       Die 4", "       Die 5", "      Die 6"},
		    		{"Die 1", "Snake Eyes", "Australian Yo", "Little Joe from Kokomo","No Field Five", "Easy Six", "Six One You're Done"}, 
		    		{"Die 2", "Ace Caught a Deuce", "Ballerina", "The Fever", "Jimmie Hicks", "Benny Blue", "Easy Eight"},
		    		{"Die 3", "Easy Four", "  OJ", "       Brooklyn Forest", "  Big Red", "Eighter from Decatur", "Nina from Pasadena"},
		    		{"Die 4", "Little Phoebe", "Easy Six", "Skinny McKinney", "Square Pair", "Railroad Nine", "Big One on the End"},
		    		{"Die 5", "Sixie from Dixie", "Skinny Dugan", "Easy Eight", "Jessy James", "Puppy Paws", "Yo"},
		    		{"Die 6", "The Devil", "  Easy Eight", "Lou Brown", "   Tennessee", "Six Five No Jive", "Midnight"}
		    };
		
		

		public static void Toss() {
		
			dice = (int) (Math.random() * 6.9); 
			if (dice==0) {
				dice++;
			}
			System.out.print(dice);

		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Welcome to the dice throw challenge! Do you feel lucky? "
            + "Press any key and ENTER to play or press (Q or q) to chicken out...");	

		String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q") || 
                input.equalsIgnoreCase("Q")) {
            System.out.println("Bye!");
            scanner.close();
            return;
        }
        else {
        System.out.println("Rolling the dice!!");
        System.out.print("You have rolled a ");
        Toss();
        dice1 = dice;
        System.out.print(" and a ");
        Toss();
        dice2 = dice;
		System.out.println("> a "+RollNames[dice1][dice2]);

		System.out.print("I have rolled a ");
	    Toss();
        dice3 = dice;
        System.out.print(" and a ");
        Toss();
        dice4 = dice;
		System.out.println("> a "+RollNames[dice3][dice4]);

		
		if ((dice1+dice2)>(dice3+dice4)) {
			System.out.println("You win!!! Did you cheat? Give me another try");
		}
		else if ((dice1+dice2)<(dice3+dice4)) {
			System.out.println("I win!!! Want to try again?");
		}
		else if ((dice1+dice2)==(dice3+dice4) && (dice1==dice2)) {
			System.out.println("You win on a double. What luck!");
		}
		else if ((dice1+dice2)==(dice3+dice4) && (dice3==dice4)) {
				System.out.println("I win on a double. I pity you...");
		}
		else
			System.out.println("Stalemate! You’re tough, let’s try for a tie-breaker.");
        }
	  
     
		
        while(true) {
        	   	
        System.out.println("Wanna try again? Enter any key if yes or Q and Enter to Quit");
		String input2 = scanner.nextLine();
        if (input2.equalsIgnoreCase("q") || 
                input2.equalsIgnoreCase("Q")) {
            System.out.println("Bye!");
            scanner.close();
            return;
        }
        else {
        	 System.out.println("Rolling the dice!!");
             System.out.print("You have rolled a ");
             Toss();
             dice1 = dice;
             System.out.print(" and a ");
             Toss();
             dice2 = dice;
     		System.out.println("> a "+RollNames[dice1][dice2]);

     		System.out.print("I have rolled a ");
     	    Toss();
             dice3 = dice;
             System.out.print(" and a ");
             Toss();
             dice4 = dice;
     		System.out.println("> a "+RollNames[dice3][dice4]);

     		
     		if ((dice1+dice2)>(dice3+dice4)) {
     			System.out.println("You win!!! Did you cheat? Give me another try");
     		}
     		else if ((dice1+dice2)<(dice3+dice4)) {
     			System.out.println("I win!!! Want to try again?");
     		}
     		else if ((dice1+dice2)==(dice3+dice4) && (dice1==dice2)) {
     			System.out.println("You win on a double. What luck!");
     		}
     		else if ((dice1+dice2)==(dice3+dice4) && (dice3==dice4)) {
     				System.out.println("I win on a double. I pity you...");
     		}
     		else
     			System.out.println("Stalemate! You’re tough, let’s try for a tie-breaker.");
        }
        
        
        }

	}

}
