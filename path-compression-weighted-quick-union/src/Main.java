import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File problem = new File("tinyQF.txt");
            Scanner fileReader = new Scanner(problem);
            int N = fileReader.nextInt();
            PathCompressionWeightedQuickUnion pCWQU = new PathCompressionWeightedQuickUnion(N);
            while (fileReader.hasNextInt()) {
                int p = fileReader.nextInt();
                int q = fileReader.nextInt();
                if (!pCWQU.connected(p, q)) {
                    pCWQU.union(p, q);
                    System.out.println(p + " " + q + " connected.");
                }
            }
            int index = 0;
            for (int id : pCWQU.getId()) {
                System.out.println(index + " " + id);
                index++;
            }
            System.out.println("0 and 3 connected: " + pCWQU.connected(0, 3));
            System.out.println("0 and 9 connected: " + pCWQU.connected(0, 9));
            System.out.println("1 and 2 connected: " + pCWQU.connected(1, 2));
            System.out.println("4 and 9 connected: " + pCWQU.connected(4, 9));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
