
/**Keeping Way More Stats
 * Dice Roll Program*/
 

/**This program will now keep track of dice rolls in a
 *way where we tally the types of pair combo rolled.*/


public class Roll {
	
		private static int dice;
		private static int dice1;
		private static int dice2;
		static int flipcount;

		
	    static int [][] RollPairs = { 
	    		{0, 1, 2, 3, 4, 5, 6}, 
	    		{1, 0, 0, 0, 0, 0, 0},
	    		{2, 0, 0, 0, 0, 0, 0},
	    		{3, 0, 0, 0, 0, 0, 0},
	    		{4, 0, 0, 0, 0, 0, 0},
	    		{5, 0, 0, 0, 0, 0, 0},
	    		{6, 0, 0, 0, 0, 0, 0}
	    };
	    						 
		
	    static void Toss() {
			dice = (int) (Math.random() * 6.9); 
			if (dice == 0) {
				dice++;
			}
		}

		public static void Output() {
			
		do {
			
				Toss();
				dice1 = dice;
				Toss();
				dice2 = dice;
				RollPairs[dice1][dice2]++;
				flipcount++;
		} while (flipcount< 1001);
				
				
		}

	

	public static void main(String[] args) {
		
		System.out.println("1000 Random 2 dice toss stats");
      
		    Output();
                
		    
		    for(int i = 0; i < RollPairs.length; i++)
		    {
		       for(int j = 0; j < RollPairs.length; j++)
		       {
		        
		          System.out.printf("Dice "+i+" and "+j+": " + RollPairs[i][j]+ " times.");
			      System.out.println();

		       }
		    }


        }

	

}
