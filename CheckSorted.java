import java.util.Scanner;
class CheckSorted
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an Array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];

		int i = 0;
		while(i<size)
		{
			System.out.println("Enter the Value of an Array : ");
			arr [i] = sc.nextInt();
			i++;
		}

		int incResult = increasing(size,arr);

		int decResult = decreasing(size,arr);

		if(incResult == 0 || decResult == 0){
			System.out.println("Array is Sorted");
		}else{
			System.out.println("Array is not Sorted");
		}
    }
    public static int increasing(int size, int [] arr)
    {
    	int i = 0;
   
    	int count = 0;
    	while(i<size -1)
    	{
    		if(arr[i] < arr[i+1]){
    		}else{
    			count++;
    		}
    		i++;
    		
    	}
    	return count;
    }

    public static int decreasing(int size,int [] arr){
    	int i = 0;
    	int count = 0;
    	while(i < size-1){
    		if(arr[i] > arr[i+1]){

    		}else {
    			count++;
    		}
    		i++;
    	}
    	return count;
    }
}	
