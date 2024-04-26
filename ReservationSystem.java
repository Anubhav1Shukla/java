import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of seats: ");;
        String str=sc.nextLine();

        try{
            int seat =Integer.parseInt(str);
            if(seat<0){
                System.out.println("Error: Number of seats is must be greater than zero.");
            }else{
                System.out.println("No of seats: "+seat);
            }
        } catch(NumberFormatException e){
            System.out.println("Error: Inavlid Input");
        }
    }
}
