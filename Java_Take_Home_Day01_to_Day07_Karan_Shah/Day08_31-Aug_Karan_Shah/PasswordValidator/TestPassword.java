
import java.util.*;

public class TestPassword {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Validator v = new Validator();
        try {
            boolean b = v.validatePassword(s);
            System.out.print(b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
