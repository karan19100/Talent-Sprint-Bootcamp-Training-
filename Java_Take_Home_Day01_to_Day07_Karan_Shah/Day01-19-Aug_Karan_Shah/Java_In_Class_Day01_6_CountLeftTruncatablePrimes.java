
public class Java_In_Class_Day01_6_CountLeftTruncatablePrimes {

    public static int getCountOfLeftTruncatablePrimes(int start_val, int end_val) { 

        if(start_val>end_val) return -1; 
        if(start_val < 0 || end_val < 0) return -2; 
        if(start_val == 0 || end_val == 0) return -3; 

        int count = 0; 

        for(int i = start_val;i<=end_val;i++){ 
            if(isLeftTruncatablePrime(i)) count++; 
        } 

        return count;
    }
    
    public static boolean isLeftTruncatablePrime(int num) {

         if(containZero(num)) return false; 

         int lengthOfNum = Integer.toString(num).length(); 

         boolean isAllLeftTruncatablePrime = true; 

         for(int i =0;i<lengthOfNum-1;i++){ 
            int slice = Integer.parseInt(String.valueOf(num).substring(i, lengthOfNum)); 
            isAllLeftTruncatablePrime = isAllLeftTruncatablePrime & isPrime(slice); 
        } 
        return isAllLeftTruncatablePrime; 
    } 
    
    public static boolean containZero(int num){ 
        if(num == 0) return true; 
        while(num > 0){ 
            if(num % 10 == 0) return true; num /= 10; 
        } 
        return false; 
    } 
    public static boolean isPrime(int num) { 
        if(num < 2) return false;
         for(int i=2;i <= num/2; i++){ 
            if(num % i == 0)
             return false; 
            } 
        return true;
    }

}
