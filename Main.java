import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter age of a: ");
        int a= sc.nextInt();
        System.out.println("Enter age of b: ");
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of age of a and b is: "+sum);

        sc.close();

    }

}