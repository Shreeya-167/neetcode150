public class MissingNumber268{

    static int missingNumber(int[] arr){

        int sum = 0;
        int arrsum = 0;
        int n = arr.length;
        sum = n*(n+1)/2;

        for(int i=0; i<n; i++){
            arrsum = arrsum + arr[i];
        }

        return sum-arrsum;

    }
    public static void main(String[] args) {

        int arr[] = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
        
    }
}