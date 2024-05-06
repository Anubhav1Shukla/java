
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
        FileWriter fr=new FileWriter("anubhav.txt");
        fr.write("Jai hind.Jai Bharat");
        fr.close();
        System.out.println("Writting in file Succes...");
    }catch(IOException e){
            System.out.println("Error found.");
            e.printStackTrace();
    }
    }
}
