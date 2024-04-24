import java.util.Scanner;
public class ExceptionOddNumber {
    public static void main(String[] args){
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter your number: ");
           String numberInput=scanner.nextLine(); 

           try{
            int number=Integer.parseInt(numberInput);
            if(number%2==0){
                System.out.println("This number is even number: "+number);
            }else{
                System.out.println("This number is odd: "+number);
            } 
           } catch(Exception e){
            System.out.println("Error: Invalid Input");
           } finally{
            System.out.println("Happy Coding");
            scanner.close();
           }
    }
}
