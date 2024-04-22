class Az {
    int Rollno=15;
    String name = "Anubhav";
    void getValues() {
        System.out.print("Name = " +name );
        System.out.println(" Rollno = " +Rollno);

    }
}
class Bz extends Az{
    void getData(){
        System.out.print("You are in class Bz");
    }
}
public class  Cz extends Bz{
    public static void main(String[]args) {
        Cz r = new Cz();
        r.getValues();
        r.getData();
        // System.out.println("Hello java");
    }
}