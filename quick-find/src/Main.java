import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File problem = new File("tinyQF.txt");
            Scanner fileReader = new Scanner(problem);
            int N = fileReader.nextInt();
            QuickFind quickFind = new QuickFind(N);
            while (fileReader.hasNextInt()) {
                int p = fileReader.nextInt();
                int q = fileReader.nextInt();
                if (!quickFind.connected(p, q)) {
                    quickFind.union(p, q);
                    System.out.println(p + " " + q + " connected.");
                }
            }
//            int index = 0;
//            for (int id : quickFind.getId()) {
//                System.out.println(index + " " + id);
//                index++;
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
