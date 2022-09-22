
public class Validator {
    public Validator() {
        super();
    }
    public static boolean validatePassword(String password) throws WrongPasswordException {
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
        for (int i = 0; i < password.length(); i++) {
            if ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) {
                a++;
            }
            if ((int) password.charAt(i) >= 97 && (int) password.charAt(i) <= 122) {
                b++;
            }
            if ((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 58) {
                c++;
            }
            if (password.charAt(i) == ' ') {
                e++;
            } else {
                d++;
            }
        }
        if (a > 0 && b > 1 && c > 0 && d > 0 && password.length() > 7 && e == 0 && b > a) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }
}
