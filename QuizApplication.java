import java.util.*;

public class QuizApplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your quiz score: ");
        String str=sc.nextLine();

        try{
            int score=Integer.parseInt(str);
            System.out.println("Quize Score: "+score);
        } catch(NumberFormatException e){
            System.out.println("Error: Invalid Input");
        }
    }
}
