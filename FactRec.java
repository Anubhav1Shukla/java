import java.util.Scanner;

public class FactRec {

    static long Factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*Factorial(n-1);
        }
    }
    
    





    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the num: ");

        int n=sc.nextInt();

        System.out.println("Factorial using Recursion: "+Factorial(n));
    }
}
