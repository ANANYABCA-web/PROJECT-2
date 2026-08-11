import java.io.FileNotFoundException;
import java.io.FileReader;



public class Sim {
    static void Readfile() throws FileNotFoundException {
        FileReader fr = new FileReader("sample.txt");

    }

    public static void main(String[] args) {
        try {
            Readfile();
            System.out.println("FILE OPENED");

        }
        catch (FileNotFoundException e){
            System.out.println("FILE not OPENED");

        }

        System.out.println("done");
    }
}