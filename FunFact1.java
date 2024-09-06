import java.util.Scanner;
public class FunFact1 {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int fact=factorial(a);
        System.out.println("fact="+fact);
    }
    
}
