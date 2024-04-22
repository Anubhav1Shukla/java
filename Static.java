class A {
    static int x = 10;
    int y = 20;
    private static int z = 30;

    static class B {
        void get() {
            A objA = new A();
            System.out.println("x: " + x);
            System.out.println("y: " + objA.y); 
            System.out.println("z: " + z);
        }
    }
}

public class Static {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.get();
    }
}