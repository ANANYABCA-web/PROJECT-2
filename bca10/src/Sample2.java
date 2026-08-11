

public class Sample2 {


    public static void main(String[] args) {
        {

            int a = 10;
            int b = 0;

            try {
                System.out.print(a / b);

            } catch (ArithmeticException e) {

                System.out.print(e);
            }
            finally {
                System.out.print("GOOD MORNING:");

            }
        }
    }
}