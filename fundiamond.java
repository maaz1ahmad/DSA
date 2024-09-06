public class fundiamond {
    public static void diamond(int n){
       for(int i=1; i<=n; i++){  //outer loop 1st half
           for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
           }
           //stars
           for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           System.out.println();
       }
       for(int i=n; i>=1; i--){  //outer loop 2nd hgalf
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
           }
           for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
           }
           System.out.println(); 
       }
    }
    public static void main(String[] args){
        diamond(4);
    }
}