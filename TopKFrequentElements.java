
import java.util.HashMap;

public class TopKFrequentElements{

    public static HashMap<Integer, Integer> topKFrequentElements(int[] arr, int k){

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i], hm.get(arr[i])+1);
            } else {
                hm.put(arr[i], 1);
            }
        }

     

        return hm;
    }

    public static void main(String[] args) {

        int[] arr = {11,2,11,11,2,3,11,3,2};
        int k = 2;

        System.out.println(topKFrequentElements(arr, k));
        
    }
}