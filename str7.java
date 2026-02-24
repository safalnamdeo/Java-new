public class str7 {

    public static void main(String[] args) {
        String str = "programming";
        char ch = 'r';   // character to check

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' is: " + count);
    }
}
