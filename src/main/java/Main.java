import java.util.*;

public class Main {
    String s1 = "waterbottle";
    String s2 = "erbottlewat";

    boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1;
            return isSubstring(s1s1, s2);
        }
        return false;
    }

    private boolean isSubstring(String s1, String s2) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("It can not be tested because the isSubstring is not implemented.");
    }
}
