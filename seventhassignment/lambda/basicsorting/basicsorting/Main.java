package basicsorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	
	  public static void main (String [] args) {
	   Integer [] array = {10, 3, 4, 15, 7, 9, 1, 21};
	   String [] chararray = {"claude", "Phil", "lois", "clark", "Arthur", "Mera", "bruce"};
	   List<String> list = Arrays.asList(chararray);

	   
	   HelpSort <Integer> intAscend = (a) -> {
		    Arrays.sort(a);
            System.out.println("Integer array is sorted in ascending order");

		    for (int i = 0; i < a.length; i++) {
		 	   System.out.print(a[i]+" ");
		 	   };
	   };
	   
	   intAscend.transform(array); 
	   
	   
	   HelpSort <Integer> intDescend = (a) -> {
		   	Arrays.sort(a, Comparator.reverseOrder());

            System.out.println('\n'+"Integer array is sorted in descending order");

		    for (int i = 0; i < a.length; i++) {
		 	   System.out.print(a[i]+" ");
		 	   };
	   };
	   
	   intDescend.transform(array);
	   
	   HelpSort <String> charArrayAscend = (a) -> {
		   Arrays.sort(a);

           System.out.println('\n'+"Sorted ASC and CASE SENSITIVITY ON:");

		    for (int i = 0; i < a.length; i++) {
		 	   System.out.print(a[i]+" ");
		 	   };
		 	   
		   Arrays.sort(chararray, String.CASE_INSENSITIVE_ORDER);

		   System.out.println('\n'+"Sorted ASC and CASE SENSITIVITY OFF:");

		    for (int i = 0; i < a.length; i++) {
		 	   System.out.print(a[i]+" ");
		 	   };

		 	   
	   };
	   
	   charArrayAscend.transform(chararray);
	   

	   HelpSort <String> charArrayDescend = (a) -> {
			Arrays.sort(a, Comparator.reverseOrder());

           System.out.println('\n'+"Sorted DSC and CASE SENSITIVITY ON:");

		    for (int i = 0; i < a.length; i++) {
		 	   System.out.print(a[i]+" ");
		 	   };
		 	   
		 	    Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		 	    Collections.reverse(list);

		 	   String[] arr = new String[list.size()]; 
		 	  
		        // ArrayList to Array Conversion 
		        for (int i =0; i < list.size(); i++) 
		            arr[i] = list.get(i); 
		        
			   System.out.println('\n'+"Sorted DSC and CASE SENSITIVITY OFF:");

		  
		        for (String x : arr) 
		            System.out.print(x + " "); 
		 	    

		  
		 	   
	   };
	   
	   charArrayDescend.transform(chararray);

	  
	  }
	

	
}
