package AP_CSA.FRQ2018;

public class CodeWordChecker {
    private int num1, num2;
    private String code;

    public CodeWordChecker(int a, int b, String s) {
        num1 = a;
        num2 = b;
        code = s;
    }
    public CodeWordChecker(String s) {
        num1 = 6;
        num2 = 20;
        code = s;
    }

    public boolean isValid(String s) {
        if (s.contains(code)) {
            return false;
        }
        if (s.length() > num2 || s.length() < num1) {
            return false;
        }
        return true;
    }
}
