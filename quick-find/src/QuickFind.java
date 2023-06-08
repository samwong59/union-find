public class QuickFind {

    private int[] id;

    // Initial ID of each object is unique to itself
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
}
