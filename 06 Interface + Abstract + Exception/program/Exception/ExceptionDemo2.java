
public class ExceptionDemo2 {

    public static void main(String[] args) {

        try {

            int arr[] = new int[5];

            arr[10] = 50;

        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception");

        } catch (Exception e) {

            System.out.println("Parent Exception" + e.getMessage());
            System.out.println("Parent Exception" + e.toString());
            // e.printStackTrace();

        }
    }
}
