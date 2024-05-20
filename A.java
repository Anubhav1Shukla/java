class A {
    void showA() {
        System.out.println("In the class A.");
    }
}

class B extends A {
    void showB() {
        System.out.println("In the class B.");
    }
}

class C extends B {
    void showC() {
        System.out.println("In the class C.");
    }

    public static void main(String[] args) {
        A sA = new A();
        sA.showA();

        B sB = new B();
        sB.showA();
        sB.showB();

        C sC = new C();
        sC.showA();
        sC.showB();
        sC.showC();
    }
}
