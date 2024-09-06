public class funfloyds_triangle { 
    public static void funfloyds_triangle(int n){
        int counter=1;
       for(int i=1; i<=n; i++){
        //inner loop how  many times will counter be printed
         for(int j=1; j<=i; j++){
            System.out.print(counter+"  ");
            counter++;
         }
         System.out.println(" ");
       } 
    }
    public static void main(String[] args){
      funfloyds_triangle(5);   
    }
    
}
