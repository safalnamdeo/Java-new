public class str3 {

    public static void main(String[] args) {
        String s1 = "programming";
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            // if character not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);
    }
}