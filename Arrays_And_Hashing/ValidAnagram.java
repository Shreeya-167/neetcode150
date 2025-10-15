// 242

import java.util.HashMap;

public class ValidAnagram {

  public static boolean validAnagram(String s, String t){

    if(s.length()!=t.length()) return false;

    char[] arr = new char[26];


    for(int i=0; i<s.length(); i++){
      arr[s.charAt(i)-'a']++;
    }

    for(int i=0; i<t.length(); i++){
      arr[t.charAt(i)-'a']--;
    }
   
    for(int ch : arr){
      if(ch!=0) return false;
    }

    return true;

  }

  public static void main(String[] args) {
   
    String s = "anagram";
    String t = "nagaram";

    System.out.println(validAnagram(s, t));


    }

}