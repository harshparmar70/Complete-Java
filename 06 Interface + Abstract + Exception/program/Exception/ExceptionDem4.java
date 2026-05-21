
import java.io.IOException;

public class ExceptionDem4 {

    static void test() throws IOException {

        throw new IOException("File Not Found");
    }

    public static void main(String[] args) {

        try {

            test();

        } catch (IOException e) {

            System.out.println(e);
        }
    }
}
