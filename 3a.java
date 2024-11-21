3) a)  Design, Develop and Implement a Java program to sort a list of elements in ascending and descending order and show exception handling.

public class Sort {
	
	void sortAscend(int arr[], int n)
	{
		//int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	}
	
	void sortDescend(int arr[], int n)
	{
		//int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	}
	
	void printArray(int arr[], int n)
    {
        //int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

public class TestSort {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		Sort s = new Sort();
		 
	    System.out.println("Input number of integers to sort");
	    n = sc.nextInt();
	 
	    int array[] = new int[10];
	 
	    System.out.println("Enter " + n + " integers");
	    
	    for (int i = 0; i < n; i++)
	    {
	    	try {
	    	array[i] = sc.nextInt();
	    	}
	    
	    catch(ArrayIndexOutOfBoundsException e){
	    	System.out.println("Index out of bound");
	    	System.exit(0);
	    }
	    
	}
	    System.out.println("Entered Array is");
	    s.printArray(array, n);
	    
	    s.sortAscend(array,n);
	    System.out.println("Ascending order: ");	    
	    s.printArray(array,n);   
	    
	    s.sortDescend(array, n);
	    System.out.println("Descending order: ");	    
	    s.printArray(array,n); 
	    
	    sc.close();

	}
	

}	
