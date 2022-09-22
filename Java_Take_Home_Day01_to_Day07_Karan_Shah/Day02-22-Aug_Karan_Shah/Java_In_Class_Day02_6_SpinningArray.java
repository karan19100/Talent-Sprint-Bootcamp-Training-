public class Java_In_Class_Day02_6_SpinningArray {

	public static int[] rotate(int[] arr, int nop) {
		//write your code here
		
		if(arr.length == 0)
		    return null;
		
		int ansArr[] = new int[arr.length];
		
		int index = 0;
		
		for(int i =1;i<=nop;i++){
		    
		    int temp = arr[arr.length-1];
		    
		    for(int j = arr.length-1;j>=1;j--){
		        arr[j] = arr[j-1];
		    }
		    
		    arr[0] = temp;
		    
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};

		int ans[] = rotate(arr,10);

		for (int i : ans) {
			System.out.print(i+" ");
		}


	}
    
}