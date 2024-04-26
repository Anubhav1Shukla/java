import java.util.*;
public class Timeconverter {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the time in seconds: ");
        String input=scanner.nextLine();
        try{
            int seconds=Integer.parseInt(input);
            if(seconds<0){
                System.out.println("Time cannot be negative.");
            }else{
                double minutes=seconds/60.0;
                System.out.printf("%.2f Minute",minutes);
                
            }
        } catch(NumberFormatException e){
            System.out.println("Error: Invalid input");
            scanner.close();
        }
    }
}
