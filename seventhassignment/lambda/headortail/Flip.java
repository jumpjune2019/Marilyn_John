import java.util.Scanner;

/**Heads or Tails
 * Coin Flip Program*/
 

/**The goal of the program to write is to display  
 * “The Coin Flip is:  Head” or “The Coin Flip is: Tail”
 *every time it executes. */


public class Flip {
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FlipCoin coinFlip = () -> {	
			int coin;
			return coin = (int) (Math.random() * 2); 
			};
		   
		FlipCoin2 Output = (result) -> {
				String Side;
				if (result == 1) {
					Side = "Heads";
					}else{
					Side = "Tails";
					}
				return Side;
			};
		
		
		System.out.println("Coin Flip Program");

		System.out.println("The Coin Flip Is: ");

		int face = coinFlip.WhichCoin();							
		String result = Output.Result(face);					 
		System.out.print(result);

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
        if (input.equalsIgnoreCase("q") || 
                input.equalsIgnoreCase("Q")) {
            System.out.println("Thank you for playing");
            scanner.close();
            return;
        }
        else {
while(true) {
        	System.out.println("The Coin Flip Is: ");
    		face = coinFlip.WhichCoin();							
    		result = Output.Result(face);					 
    		System.out.println(result);
        	System.out.println("Press any key to flip again");
    		input = scanner.nextLine();
            if (input.equalsIgnoreCase("q") || 
                    input.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for playing");
                scanner.close();
                return;
            }
}
        }
		

	}

}
