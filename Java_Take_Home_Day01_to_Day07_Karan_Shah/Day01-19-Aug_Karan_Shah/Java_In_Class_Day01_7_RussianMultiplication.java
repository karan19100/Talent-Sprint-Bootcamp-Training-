public class Java_In_Class_Day01_7_RussianMultiplication {

    public int getProduct(int num1, int num2){
        
        if(num1 < 0 || num2< 0) return -1;
        int result = 0;

        while (num2 > 0) {
            if((num2 & 1) != 0)
                result += num1;
                num1 <<= 1;
                num2 >>= 1;

        }

        return result;

    }
}
