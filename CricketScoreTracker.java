import java.util.*;

public class CricketScoreTracker {
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player number: ");
        int numPlayers=sc.nextInt();
        System.out.println("Enter the scores of the players: ");
        int[] scores=new int[numPlayers];


        for(int i=0;i<numPlayers;i++){
            scores[i]=sc.nextInt();

        }
        System.out.println("Enter the player number to see the score for: ");
        int playNumber=sc.nextInt();

        try{
            if(playNumber<1 || playNumber >numPlayers){
                throw new IndexOutOfBoundsException();
            }
            System.out.println(scores[playNumber-1]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error: Player does not exists");
        }
    }
}
