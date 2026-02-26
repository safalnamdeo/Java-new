import java.util.HashMap;

public class hash1 {
    public static void main(String[] args) {
        String str="hello";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){}
            System.out.println(ch);
            break;

        }


        System.out.println(map);
        
    }
    
}
// import java.util.HashMap;

// public class hash1 {
//     public static void main(String[] args) {
//         String str = "aabbcdd";

//         HashMap<Character, Integer> map = new HashMap<>();

//         // Step 1: Count frequency
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         // Step 2: Find first non-repeating
//         boolean found = false;

//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             if(map.get(ch) == 1){
//                 System.out.println("First non-repeating character: " + ch);
//                 found = true;
//                 break;
//             }
//         }

//         if(!found){
//             System.out.println("No non-repeating character");
//         }
//     }
// }