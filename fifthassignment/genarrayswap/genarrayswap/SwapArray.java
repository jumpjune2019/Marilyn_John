package genarrayswap;

public class SwapArray {

	
	public static <E> void swapIndex (E[] inputArray) {
		E temp = inputArray[1];
		inputArray[1] = inputArray[2];
		inputArray[2] = temp;
		
		System.out.println("\nPrinting array contents with swap: ");
		
		for (int i=0; i<inputArray.length; i++)	{
			System.out.print(inputArray[i] + " ");
		 }
	
		
	}
	
	
	public static void main(String[] args) {
		Integer[] arrayList = {1, 2, 3, 4, 5};
		
		System.out.println("Printing array contents: ");
		
		for (int i=0; i<arrayList.length; i++)	{
			System.out.print(arrayList[i] + " ");
		 }
		
		swapIndex(arrayList);
		
		/*
		int temp = arrayList[1];
		arrayList[1] = arrayList[2];
		arrayList[2] = temp;
		
		System.out.println("\nPrinting array contents with swap: ");
		
		for (int i=0; i<arrayList.length; i++)	{
			System.out.print(arrayList[i] + " ");
		 }
		*/
	}

}
