import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File problem = new File("tinyWQU.txt");
            Scanner fileReader = new Scanner(problem);
            int N = fileReader.nextInt();
            WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(N);
            while (fileReader.hasNextInt()) {
                int p = fileReader.nextInt();
                int q = fileReader.nextInt();
                if (!weightedQuickUnion.connected(p, q)) {
                    weightedQuickUnion.union(p, q);
                    System.out.println(p + " " + q + " connected.");
                }
            }
            int index = 0;
            System.out.println("Object | ID | Size");
            int[] id = weightedQuickUnion.getId();
            int[] size = weightedQuickUnion.getSize();
            while (index < N) {
                System.out.println(index + " | " + id[index] + " | " + size[index]);
                index++;
            }
            System.out.println("0 and 3 connected: " + weightedQuickUnion.connected(0, 3));
            System.out.println("0 and 9 connected: " + weightedQuickUnion.connected(0, 9));
            System.out.println("1 and 2 connected: " + weightedQuickUnion.connected(1, 2));
            System.out.println("4 and 9 connected: " + weightedQuickUnion.connected(4, 9));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
