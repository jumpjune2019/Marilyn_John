
public class SearchArray {

	
	
	static String myList[] = {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money", "Zoo"};
	
	
	public static void main(String[] args) {
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items");
		System.out.println("bozo, FooBar, Delta, Foozball, Demo, Money, Zoo");
		
		
		arrayHasExactMatch (myList, "zo", false); 
		arrayHasExactMatch (myList, "zoo", false);
		arrayHasExactMatch (myList, "zoo", true); 
		arrayHasExactMatch (myList, "foo", true); 
		arrayHasExactMatch (myList, "foo", false); 
		arrayHasExactMatch (myList, "delta", true); 
		arrayHasExactMatch (myList, "Delta", true);
		
		
		indexOfOccuranceInArray (myList, "zo", false); 
		indexOfOccuranceInArray (myList, "zoo", false); 
		indexOfOccuranceInArray (myList, "zoo", true); 
		indexOfOccuranceInArray (myList, "foo", true); 
		indexOfOccuranceInArray (myList, "foo", false); 
		indexOfOccuranceInArray (myList, "delta", true); 
		indexOfOccuranceInArray (myList, "Delta", true); 
		
		
	}

	private static void indexOfOccuranceInArray(String[] myList2, String string, boolean b) {
		// TODO Auto-generated method stub
		int count=0;
	for(int i=0; i<myList2.length; i++)
	{
	String str = myList2[i];
    int firstIndex = str.indexOf(string); 
    
    if(firstIndex !=-1) {
    count++;
	}	
	}
    System.out.println("occurence is "+count);
	
	}

	
	
	private static void arrayHasExactMatch(String[] myList2, String string, boolean b) {
		// TODO Auto-generated method stub
		boolean count=false;
		for(int i = 0; i < myList2.length; i++)
		{
		    
			if(myList2[i].contains(string))
		    {
		        count = true;
		        break;
		    }
			
			System.out.println("count="+count);

		}
		
		if ((b=false) && (count=false)) {
				System.out.print(" is true");
			}
			else {
				System.out.print(" is false");
			}
			
		}
		

		
		
	}




