import java.util.HashSet;

public class ContainsDuplicate {

     public static boolean containsDuplicate(int[] arr){

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<arr.length; i++){
         if(hs.add(arr[i]) == false){
             return true;
             }
        }

    //  System.out.println(hs);
     return false;
     }
        public static void main(String[] args){
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        // int[] arr = {1,2,4,5,7,8,9};
        System.out.println(containsDuplicate(arr));
    }

}