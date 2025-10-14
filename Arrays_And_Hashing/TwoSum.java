
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i<arr.length; i++){
            hm.put(arr[i], i);
        }

        for(int i=0; i<arr.length; i++){
            int temp = target - arr[i];
            if(hm.containsKey(temp) && hm.get(temp)!=i){
                return new int[]{i, hm.get(temp)};
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = {2,7,11,11};
        System.out.println(Arrays.toString(twoSum(arr, 22)));
        
    }
}