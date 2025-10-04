import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        int n=sc.nextInt();



        int og=n;
        int rev=0;
        while(n!=0){
            int dig=n%10;
            rev=rev*10+dig;
            n/=10;

        }


        if(og==rev){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrom");
        }
    }
}
