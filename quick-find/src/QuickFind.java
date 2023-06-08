public class QuickFind {

    private int[] id;

    // Initial ID of each object is unique to itself
    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // Checks for path between objects p and q
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Creates path between objects p and q
    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
    }

    public int[] getId() {
        return id;
    }
}
