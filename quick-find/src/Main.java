import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File problem = new File("tinyQF.txt");
            Scanner fileReader = new Scanner(problem);
            while (fileReader.hasNextInt()) {
                //System.out.println(fileReader.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
