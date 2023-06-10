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
                quickFind.union(fileReader.nextInt(), fileReader.nextInt());
            }
//            for (int id : quickFind.getId()) {
//                System.out.print(id);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
