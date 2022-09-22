public class Java_In_Class_Day02_7_ConsecutiveArrayElements {
    

	public static int validateInputs(int[] arr, int target) {
		//write your code here

        if(arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
            return -2;
        }

        if(target < 1)
            return -3;
        return 1;

	}


	public static boolean containsConsecutiveElements(int[] arr, int target) {
		//write your code here
        int sum =0;
        if(validateInputs(arr, target)==1){
            for (int i = 0; i < arr.length-1; i++) {
                sum=arr[i];
                for (int j = i+1; j < arr.length; j++) {
                    sum += arr[j];
                    if(sum == target){
                        return true;
                    }
                    if(sum>target)
                        break;
                }
            }
        }
        return false;
	}


}

