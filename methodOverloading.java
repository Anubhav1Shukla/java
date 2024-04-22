public class methodOverloading {
    void getValues(int... a) {
        for (int value : a) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        methodOverloading ab = new methodOverloading();
        ab.getValues(1, 2, 3);
    }
}
 