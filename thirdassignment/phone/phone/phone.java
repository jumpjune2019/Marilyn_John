package phone;
	
	
	import java.util.Scanner;


    public class phone {
    	
    	static int i=0;
    	
        public static void main(String[] args){
            new phone ();
        }

        // This will act as our program switchboard
        	public phone (){
            Scanner input = new Scanner(System.in);
            String[][] personalInfo = new String[5][3];

            System.out.println("Welcome to the Phonebook.");
            System.out.println("Please select a number from the options below");
            System.out.println("");

            while(true){
                // Give the user a list of their options
                System.out.println("1: Add a new person.");
                System.out.println("2: Remove a person.");           
                System.out.println("0: Exit Phonebook.");

                // Get the user input
                int userChoice = input.nextInt();

                switch(userChoice){
                    case 1: 
                        addContact(personalInfo);
                        break;
                    case 2: 
                        removeContact(personalInfo);
                        i--;
                        break;              
                    case 0: 
                        System.out.println("Thank you for using the Phonebook.  Goodbye.");
                        System.exit(0);
                    case 3:
                    	String aString = "";
         		        for(int row = 0; row < personalInfo.length; row++) {
         		    	     for(int col = 0; col < personalInfo[row].length; col++) {
         		    	        aString += "             " + personalInfo[row][col];
         		    	     }
         		    	        aString += "\r\n";
         		    	  }
         			    System.out.println(aString);
                }
            }

        }

        private void addContact(String personalInfo[][])
     {

            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println( " Please enter the name, phone number and city of the phonebook entry. (I.E. First Name only, Phone#(no spaces), and City. Max 5 Contacts)");
            String addedContact = input.nextLine(); 
            String number = input.nextLine();
            String city = input.nextLine();
            
            
            
            


     //   for(int i = 0; i < personalInfo.length; i++)
       // {
          //  for(int j = 0; j < personalInfo[i].length; j++){
           int j = 0;
           if(personalInfo[i][j] == null)
           {
               personalInfo[i][0] = addedContact; 
               personalInfo[i][1] = number;
               personalInfo[i][2] = city;
               i++;
           }


       }
        
    


    private void removeContact(String personalInfo[][]) {
    Scanner input = new Scanner(System.in);
    System.out.print( " Please enter first name only that you would like to remove. ");
    String deleteContact = input.nextLine();
    //int j = 0;
    System.out.print(deleteContact);
    for(int m = 0; m < personalInfo.length; m++)
    {
     if(personalInfo[m][0].equals(deleteContact))
    {
        personalInfo[m][0] = null;
        personalInfo[m][1] = null;
        personalInfo[m][2] = null;
    }
    else {
    	System.out.print("No such person found");
   
    }

        }
    }
    }
    

    

 //       }   
    

	
	


