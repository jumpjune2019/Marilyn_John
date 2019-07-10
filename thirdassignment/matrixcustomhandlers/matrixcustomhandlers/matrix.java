package matrixcustomhandlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;




		
		public class matrix 
		{
			
			
			
		    static String[][] RollNames = { 
		    		{" ' ", "  Die 1", "       Die 2", "      Die 3", "       Die 4", "       Die 5", "      Die 6"},
		    		{"Die 1", "Snake Eyes", "Australian Yo", "Little Joe from Kokomo","No Field Five", "Easy Six", "Six One You're Done"}, 
		    		{"Die 2", "Ace Caught a Deuce", "Ballerina", "The Fever", "Jimmie Hicks", "Benny Blue", "Easy Eight"},
		    		{"Die 3", "Easy Four", "  OJ", "       Brooklyn Forest", "  Big Red", "Eighter from Decatur", "Nina from Pasadena"},
		    		{"Die 4", "Little Phoebe", "Easy Six", "Skinny McKinney", "Square Pair", "Railroad Nine", "Big One on the End"},
		    		{"Die 5", "Sixie from Dixie", "Skinny Dugan", "Easy Eight", "Jessy James", "Puppy Paws", "Yo"},
		    		{"Die 6", "The Devil", "  Easy Eight", "Lou Brown", "   Tennessee", "Six Five No Jive", "Midnight"}
		    };
			
						
			
		    public void writing() {
		    	
		    	
		    	Scanner scanner = new Scanner(System.in);
				
				System.out.println("Would you like to print to (f)ile or (c)console or (b)oth?");
		        
				String input = scanner.nextLine();
		        if (input.equalsIgnoreCase("c") || 
		                input.equalsIgnoreCase("C")) {
		        	
		        	
		        	System.out.print("Dice Combinations Label Matrix");
			    	
		            
		    		String aString = "";
		    		       for(int row = 0; row < RollNames.length; row++) {
		    		    	     for(int col = 0; col < RollNames[row].length; col++) {
		    		    	        aString += "             " + RollNames[row][col];
		    		    	     }
		    		    	        aString += "\r\n";
		    		    	  }
		    			     System.out.print(aString);
		        	
		        }
		        else if (input.equalsIgnoreCase("f") || 
		                input.equalsIgnoreCase("F")) {
		        
		        
		    	
		    	
		        try {
		            
		            File statText = new File("C:/java training/hello.txt");
		            FileOutputStream is = new FileOutputStream(statText);
		            OutputStreamWriter osw = new OutputStreamWriter(is);    
		            BufferedWriter w = new BufferedWriter(osw);
		            
		            
		            w.write("Dice Combinations Label Matrix");
		            
		    		String aString = "";
		    		       for(int row = 0; row < RollNames.length; row++) {
		    		    	     for(int col = 0; col < RollNames[row].length; col++) {
		    		    	        aString += "             " + RollNames[row][col];
		    		    	     }
		    		    	        aString += "\r\n";
		    		    	  }
		    			     w.write(aString);
		                     w.close();
		        } catch (IOException e) {
		            System.err.println("Problem writing to the file statsTest.txt");
		        }
		    }
		    
		    
		    
		    else if (input.equalsIgnoreCase("f") || 
		                input.equalsIgnoreCase("F"))
		    {
		     	System.out.print("Dice Combinations Label Matrix");
		    	
	            
	    		String aString = "";
	    		       for(int row = 0; row < RollNames.length; row++) {
	    		    	     for(int col = 0; col < RollNames[row].length; col++) {
	    		    	        aString += "             " + RollNames[row][col];
	    		    	     }
	    		    	        aString += "\r\n";
	    		    	  }
	    			     System.out.print(aString);
		    }
 try {
		            
		            File statText = new File("C:/java training/hello.txt");
		            FileOutputStream is = new FileOutputStream(statText);
		            OutputStreamWriter osw = new OutputStreamWriter(is);    
		            BufferedWriter w = new BufferedWriter(osw);
		            
		            
		            w.write("Dice Combinations Label Matrix");
		            
		    		String aString = "";
		    		       for(int row = 0; row < RollNames.length; row++) {
		    		    	     for(int col = 0; col < RollNames[row].length; col++) {
		    		    	        aString += "             " + RollNames[row][col];
		    		    	     }
		    		    	        aString += "\r\n";
		    		    	  }
		    			     w.write(aString);
		                     w.close();
		        } catch (IOException e) {
		            System.err.println("Problem writing to the file hello.txt");
		       
		    } catch (InputMismatchException exception) {
		    	System.err.println("Wrong input. Please use c, f, or b.");
		    }
		    
            scanner.close();

		    }
		    	
		    	
		    	
		     	

		    public static void main(String[]args) {
		        matrix write = new matrix();
		        write.writing();
		    }		} 

	
	
	
	
	
	
	
	
	
	
	
	
