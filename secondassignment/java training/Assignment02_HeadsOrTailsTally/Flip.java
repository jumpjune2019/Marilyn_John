/**Heads or Tails Tally
 * Coin Flip Program*/
 

/**The goal of the program to write is to display   
 * a tally of occurrences of the state of
 * “Head” and/or “Tail” in an iteration loop. */


public class Flip {
	
		static int[] count = {0,0};	
		static int flipcount;

		private static int coin;

		public static void Toss() {
			coin = (int) (Math.random() * 2); 
		}

		public static void Output() {
			
			do {
				Toss();
			if (coin == 1){
				count[0]++;
				flipcount++;
				}else{
				count[1]++;
				flipcount++;
				}
			} while (flipcount< 1001);

		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1000 Coin Flips");

		Output();
		
		System.out.println("Count of Heads: "+count[0]);
		System.out.println("Count of Tails: "+count[1]);

	}

}
