public class str2{

    public static void main(String[] args) {
        String s1 = "nitin";   // change this to test

        String reversed = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed =reversed+s1.charAt(i);
        }

        if (s1.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}