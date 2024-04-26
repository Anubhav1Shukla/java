import java.util.*;
// public class Percentage {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Numrator: ");
//         String n=sc.nextLine();
//         System.out.println("Enter Denominator");
//         String d=sc.nextLine();
//         try{
//             int n1=Integer.parseInt(n);
//             int d2=Integer.parseInt(d);
//             if(d2!=0){
//                 double percetage=(double)n1/d2*100;
//                 System.out.println("Percentage is : "+percetage+" %");
            
//             } 
//             else{
//                  System.out.println("Error: Division by Zero");
//               }
            
//         } catch(ArithmeticException e){
//             System.out.println("Error: Invalid Input");
//         }
//     }
// }
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the numerator:");
            int numerator = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Enter the denominator:");
            int denominator = Integer.parseInt(scanner.nextLine());
            
            if (denominator == 0) {
                System.out.println("Error: Division by zero.");
            } else {
                try {
                    double percentage = (double)numerator / denominator * 100;
                    System.out.println("Percentage: " + percentage + "%");
                } catch (ArithmeticException e) {
                    System.out.println("Error: Arithmetic overflow.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        }
    }
}

