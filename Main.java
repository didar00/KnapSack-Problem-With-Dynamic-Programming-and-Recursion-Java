public class Main {
    public static void main(String[] args) {
        int values[] = new int[] { 60, 100, 120 };
        int weights[] = new int[] { 10, 20, 30 };
        int limit = 50;
        int n = values.length;
        // stores the total value of the pieces inside the sack
        int sack = 0;
        KnapSackDynamic obj = new KnapSackDynamic(n, limit);
        System.out.println(obj.knapSack(limit, weights, values, n));
    }
}
