
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
        FileWriter fw=new FileWriter("anubhav.txt");
        fw.write("Jai hind.Jai Bharat");
        fw.close();
        System.out.println("Writting in file...");
    }catch(IOException e){
            System.out.println("Error found.");
            e.printStackTrace();
    }
    }
}
