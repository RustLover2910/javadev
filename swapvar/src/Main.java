public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "drink";
        String z;
        System.out.println("x: " + x + ", y: " + y);

        z = x;
        x = y;
        y = z;
        System.out.println("After Swapping!");
        System.out.println("x: " + x + ", y: " + y);

    }
}