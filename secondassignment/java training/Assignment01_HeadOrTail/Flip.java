/**Heads or Tails
 * Coin Flip Program*/
 

/**The goal of the program to write is to display  
 * “The Coin Flip is:  Head” or “The Coin Flip is: Tail”
 *every time it executes. */


public class Flip {
	
		private static int coin;

		public static void Toss() {
			coin = (int) (Math.random() * 2); 
		}

		public static void Output() {
			if (coin == 1){
				System.out.println("Heads");
				}else{
				System.out.println("Tails");
				}
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coin Flip Program");

		System.out.println("The Coin Flip Is: ");

		Toss();
		Output();

	}

}
