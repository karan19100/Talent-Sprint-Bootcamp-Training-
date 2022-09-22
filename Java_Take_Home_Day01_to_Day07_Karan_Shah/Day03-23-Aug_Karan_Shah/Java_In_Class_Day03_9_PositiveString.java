public class Java_In_Class_Day03_9_PositiveString {

    public static boolean isValidString(String str) {

        for (int i = 0; i < str.length(); i++)
            if (!Character.isLetter(str.charAt(i)))
                return false;

        return true;
    }

    public static boolean isPositiveString(String str) {

        str = str.toLowerCase();

        if (!isValidString(str)) return false;

        for (int i = 1; i < str.length(); i++)
            if (str.charAt(i - 1) > str.charAt(i))
                return false;

        return true;

    }
}

   //  Test Case

//    public static void main(String[] args) {
//
//        String words =  "abcd";
//        System.out.println(isPositiveString(words));
//    }
//
//}
