public class Java_In_Class_Day03_8_ReverseWords {

    public static String getReverseString(String str) {

        char[] arr = str.toCharArray();
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        String ans = new String(arr);
        return ans;
    }

    public static String reverse(String str) {

        if (str == (null) || str.length() == 0) return null;

        String words[] = str.split(" ");
        String ans = "";

        for (int i = 0; i < words.length; i++)
            ans += getReverseString(words[i]) + " ";

        return ans.trim();
    }
}

    // Test Case

//    public static void main(String[] args) {
//        String words = "talent sprint";
//        System.out.println(reverse(words));
//    }
//
//}
