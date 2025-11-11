package Lecture10;

public class PermutationString {
    static void permute(String rem, String ans) {
        if (rem.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < rem.length(); i++) {
            char ch = rem.charAt(i);
            String left = rem.substring(0, i);
            String right = rem.substring(i + 1);
            permute(left + right, ans + ch);
        }
    }
    public static void main(String[] args) {
        permute("ABC", "");
    }
}

