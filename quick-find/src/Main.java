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
            int index = 0;
            for (int id : quickFind.getId()) {
                System.out.println(index + " " + id);
                index++;
            }
            System.out.println("0 and 3 connected: " + quickFind.connected(0, 3));
            System.out.println("0 and 9 connected: " + quickFind.connected(0, 9));
            System.out.println("1 and 2 connected: " + quickFind.connected(1, 2));
            System.out.println("4 and 9 connected: " + quickFind.connected(4, 9));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
