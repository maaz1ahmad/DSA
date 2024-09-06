public class MaxAndMinArray {
    public static int setMini(int num[]){
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]<mini){
                mini = num[i];
            } 
        }
        return mini;
    }
    public static int setMaxi(int num[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i]>maxi){
                maxi=num[i];
            }
        }
        return maxi;
    } 
    public static void main(String[] args){
        int num[] = {4,9,6,5,2,3};
        System.out.println("Mini element is: "+ setMini(num));
        System.out.println("Maxi element is: "+ setMaxi(num));
    }
}