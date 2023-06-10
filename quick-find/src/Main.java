import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File problem = new File("tinyQF.txt");
            Scanner fileReader = new Scanner(problem);
            QuickFind quickFind = new QuickFind(fileReader.nextInt());
            while (fileReader.hasNextInt()) {
                int p = fileReader.nextInt();
                int q = fileReader.nextInt();
                if (!quickFind.connected(p, q)) {
                    quickFind.union(fileReader.nextInt(), fileReader.nextInt());
                }
            }
//
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
