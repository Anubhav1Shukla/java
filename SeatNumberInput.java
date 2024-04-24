import java.util.Scanner;

public class SeatNumberInput{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your seat number: ");
        String seatNumberInput=scanner.nextLine();
        try{
            int seatNumber=Integer.parseInt(seatNumberInput);
            System.out.println("Your seat number is : "+seatNumber);
        } catch(Exception e){
            System.out.println("Error: Invalid Input");
        } finally{
            System.out.println("Thank you for using our system.");
            scanner.close();
        }
    }
}