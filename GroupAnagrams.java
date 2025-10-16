import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams{

    static List<List<String>> groupAnagrams(String[] arr){

        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);

            if(hm.containsKey(s)){
                hm.get(s).add(arr[i]);
            } else {
            List<String> ls = new ArrayList<>();
            ls.add(arr[i]);
            hm.put(s, ls);
            }
        }

        return new ArrayList<>(hm.values());

    }

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(arr));
        
    }

}