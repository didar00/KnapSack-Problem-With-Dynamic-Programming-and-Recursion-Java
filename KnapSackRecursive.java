import java.lang.Math;

public class KnapSackRecursive {

    public static int knapSack(int limit, int[] weights, int[] values, int len, int sack) {
        if (limit <= 0 || len <= 0)
            return sack;

        // weight of the current piece
        int wCurr = weights[len-1];
        // value of the current piece
        int valCurr = values[len-1];

        // first case not includes the current piece
        // second case includes the current piece
        return Math.max(knapSack(limit, weights, values, len-1, sack),
                knapSack(limit-wCurr, weights, values, len-1, sack+valCurr));
    }

}
