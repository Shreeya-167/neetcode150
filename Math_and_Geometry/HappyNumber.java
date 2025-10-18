public class HappyNumber{

    // public static void happyNumber(int n){
    //     int sum = 0;
    //     while(n!=0){
    //         int num = n%10;
    //         System.out.println(n);
    //         sum = (int)Math.pow(num, 2) + sum;
    //         n = n/10;
    //         System.out.println(n);
    //     }
    //     System.out.println(sum);
    // }

    public static boolean happyNumber(int n){
        int sum=0;
        while(n!=0){
            sum = (int)Math.pow(n%10, 2) + sum;
            n = n/10;
        }

        if(sum==1) return false;

        happyNumber(sum);
        return true;
    }



    public static void main(String[] args) {
        System.out.println(happyNumber(101));
        // System.out.println(7/10);

    }
}