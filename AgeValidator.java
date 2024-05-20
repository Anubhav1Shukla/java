import java.util.*;

public class AgeValidator {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the age: ");
            String input=sc.nextLine();
            try{
                int age=Integer.parseInt(input);
                if(age<0){
                    System.out.println("Error Invalid input");
                } else{
                    System.out.println("Your age is: "+age);
                }
            } catch(ArithmeticException e){
                System.out.println("Error: Invalid age input");
            }
    }
}
