interface Program {
    void run();
    void execute();
}

public class Inter implements Program {
    public void run() {
        System.out.println("hello ji!");
    }

    public void execute() {
        // Implement execute method here
    }

    public static void main(String[] args) {
        Inter inter = new Inter();
        inter.run(); 
        inter.execute();  
    }
}
