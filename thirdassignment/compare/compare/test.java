package compare;

import java.io.*;
import java.io.File;


	public class test {
	// Alexander recommendation	
	//	private static FileInputStream file1;  int length = file1.available(); 
	//	private static FileInputStream file2;
		
		
	

		public static void main(String[] args) throws IOException
		{

		    
			File input1 = new File("C:/java training/file.txt");
		    File input2 = new File("C:/java training/file2.txt");


			try {
			
		    BufferedReader read1=new BufferedReader(new FileReader(input1));
		    BufferedReader read2=new BufferedReader(new FileReader(input2));

   
		    int counter = 0;
		    int counter2 = 0;
		    
 		    
		          while((counter=read1.read())!=-1){  
		              counter++;  
		              }  

		          while((counter=read2.read())!=-1){  
		              counter2++;  
		              }  
		    		
		    if(counter==counter2) {
		        	  
		        	  BufferedReader readcompare=new BufferedReader(new FileReader(input1));
		  		      BufferedReader readcompare2=new BufferedReader(new FileReader(input2));

      
		        	  int i=0;  
		        	  int j=0;
		        	  int filecontents1=0;
		        	  int filecontents2=0;
		        	  
		        	  int keepcount=0;
		        	  
		              while((i=readcompare.read())!=-1 && (j=readcompare2.read()) !=-1 ){ 
		            	
		            	  filecontents1 = readcompare.read();
			        	  filecontents2 = readcompare2.read();		  
		            	  
			        	  if(filecontents1!=filecontents2) {
			        		  System.out.println("Result: different content\r\n" + "");
			        		  System.out.println("Character length for first = "+ counter);
			        		  break; //this is not equal content and needs to go to different content
			        	  }
			        	  else  {
			        		  //System.out.print((char)i); 
	        	  
			        		  	if(filecontents1==filecontents2) {
			        		  		keepcount++;
		            	  	  //System.out.println("Result: identical content\r\n" + "");
		            		  //System.out.println("Character length for both = "+ counter);
			        		  	}
			        		  	else {
			        		  		System.out.println("Result: different content\r\n" + "");
			        		  		System.out.println("Character length for both = "+ counter);
		        		  
			        		  	}
			        	  }}}
		              else {
		        	  System.out.println("Result: different content\r\n" + "");
		        	  System.out.println("Character length for first = "+ counter);
		        	  System.out.println("Character length for second = "+ counter2);
		        	 
		              }
			
		
		        	  		    		
		              
				
			    
		   
		              }catch (IOException e) {
		        e.printStackTrace();
		    }


		   	}
		
		
		
		
	}

			
	
	

