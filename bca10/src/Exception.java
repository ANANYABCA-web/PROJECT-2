import java.io.File;
import java.io.FileNotFoundException;
import java .io.FileReader;
public class Exception {
    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("abc.text");

        } catch (FileNotFoundException e) {
            System.out.println("filesnotfond");
        }

    }
}


