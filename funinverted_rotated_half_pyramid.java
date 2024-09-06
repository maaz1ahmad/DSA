public class funinverted_rotated_half_pyramid {
    //outer loop
    public static void inverted_half_pyramid(int n){
        for(int i=1; i<=n; i++){ // outer loop
            //sapaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        inverted_half_pyramid(4);
    }
}