import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ReadFile {
    public static void main(String[] args) {
        try{
            File fr=new File("anubhav.txt");
            Scanner myReader=new Scanner(fr);
            while (myReader.hasNextLine()) {
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("Something Wrong...");
            e.printStackTrace();
        }
    }
}
