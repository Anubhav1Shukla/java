class A {
    final double balance=500;
    void display(){
        System.out.println("from the class A");
    }
}
    public class fina extends A{
            // void display(){
            //     System.out.println("from class fprogramm");
            // }
            public static void main(String[] args){
                    fina r=new fina();
                    System.out.println("balance: "+r.balance); 
                    r.display();
            }
        
    }




    