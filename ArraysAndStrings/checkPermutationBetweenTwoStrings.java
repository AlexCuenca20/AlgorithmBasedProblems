import java.util.*;

public class Main {
    public static boolean isPermutation(String s, String t){
        if(s.length() != t.length()) return false;
        
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
        
        for(int i=0; i<s.length(); ++i){
            if(characters.containsKey(s.charAt(i))){
                int counter = characters.get(s.charAt(i))+1;
                characters.put(s.charAt(i), counter);
            }
            else{
                characters.put(s.charAt(i), 1);
            }
        }
        
        for(int i=0; i<t.length(); ++i){
            if(!(characters.containsKey(t.charAt(i)))){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) throws Exception {
        String s = "abcdefghijk";
        String t = "ajkbciefghd";
        
        System.out.println(isPermutation(s, t));
    }
}
