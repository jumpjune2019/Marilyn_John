/**Throw a dice
 * Dice Roll Program*/
 

/**This program will allow the user to display a dice    
 *and will keep asking the user if they wish to throw
 *another one or ask the user to exit the program.*/

import java.util.Scanner;


public class Roll {
	
		private static int dice;

		public static void Toss() {
			dice = (int) (Math.random() * 6.9); 
		}

		public static void Output() {
			
		//	do {
				Toss();
				
				switch (dice) {
				  case 1:
				    System.out.println("You have rolled a 1");
				    break;
				  case 2:
				    System.out.println("You have rolled a 2");
				    break;
				  case 3:
				    System.out.println("You have rolled a 3");
				    break;
				  case 4:
					System.out.println("You have rolled a 4");
					break;
				  case 5:
				    System.out.println("You have rolled a 5");
				    break;
				  case 6:
				    System.out.println("You have rolled a 6");
				    break;
				}
				
				
				
		//	} while (flipcount< 1001);

		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press any key to throw a die and press Enter (or Q and Enter to quit)");
      
		String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q") || 
                input.equalsIgnoreCase("Q")) {
            System.out.println("Bye!");
            scanner.close();
            return;
        }
        else {
            Output();
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
            Output();

        }
        
        
        }

	}

}
