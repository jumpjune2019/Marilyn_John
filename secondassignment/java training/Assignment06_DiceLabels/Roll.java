import java.util.Arrays;

/**Labeling Pair of Dice
 * Matrix*/
 

/**This program will print out a matrix where each    
 *combination of two dice are assigned a label. */



public class Roll {
	
		
	    static String[][] RollNames = { 
	    		{" ' ", "  Die 1", "       Die 2", "      Die 3", "       Die 4", "       Die 5", "      Die 6"},
	    		{"Die 1", "Snake Eyes", "Australian Yo", "Little Joe from Kokomo","No Field Five", "Easy Six", "Six One You're Done"}, 
	    		{"Die 2", "Ace Caught a Deuce", "Ballerina", "The Fever", "Jimmie Hicks", "Benny Blue", "Easy Eight"},
	    		{"Die 3", "Easy Four", "  OJ", "       Brooklyn Forest", "  Big Red", "Eighter from Decatur", "Nina from Pasadena"},
	    		{"Die 4", "Little Phoebe", "Easy Six", "Skinny McKinney", "Square Pair", "Railroad Nine", "Big One on the End"},
	    		{"Die 5", "Sixie from Dixie", "Skinny Dugan", "Easy Eight", "Jessy James", "Puppy Paws", "Yo"},
	    		{"Die 6", "The Devil", "  Easy Eight", "Lou Brown", "   Tennessee", "Six Five No Jive", "Midnight"}
	    };
	    						 
		public static void main(String[] args) {
		
		System.out.println("Dice Combinations Label Matrix");
      
		String aString = "";
		       for(int row = 0; row < RollNames.length; row++) {
		    	     for(int col = 0; col < RollNames[row].length; col++) {
		    	        aString += "             " + RollNames[row][col];
		    	     }
		    	        aString += "\r\n";
		    	  }
			     System.out.println(aString);

		       
		       
		       
		    
		    
        }

	

}