
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void  main(String[] args){
        File Fobj=new File("anubhav.txt");
        try{
            if(Fobj.createNewFile()){
                System.out.println("File is created: "+Fobj);
            }else{
                System.out.println("File is already exits.");
            }
        }catch(IOException e){
            System.out.println("Something Wrong.");
            e.printStackTrace();
        }
    }
}
