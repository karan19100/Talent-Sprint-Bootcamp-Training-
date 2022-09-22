public class Test{
    public static void main(String[] args) {
      char c[]={'A', '1', 'b' ,' ' ,'a' , '0'};

           for (int i = 0; i < 5; ++i) {

                  i++;

                  if(Character.isDigit(c[i]))

                      System.out.println(c[i]+" is a digit");

                  if(Character.isWhitespace(c[i]))

                      System.out.println(c[i]+" is a Whitespace character");

                  if(Character.isUpperCase(c[i]))

                      System.out.println(c[i]+" is an Upper case Letter");

                  if(Character.isLowerCase(c[i]))

                      System.out.println(c[i]+" is a lower case Letter");

                  i++;

           }
        
    }
}