/**
 * 
 * That solution uses MEMOIZATION METHOD
 * 
 */

import java.util.Arrays;

public class KnapSackDynamic {
    public int[][] mem;

    public KnapSackDynamic(int size, int weightLimit) {
        mem = new int[size + 1][weightLimit + 1];

        for (int[] row: mem)
            Arrays.fill(row, -1);
    }
    
    public int knapSack(int limit, int[] weights, int[] values, int size)
    {
        if (size <= 0 || limit <= 0)
            return 0;

        if (mem[size][limit] != -1)
            return mem[size][limit];

        if (weights[size-1] <= limit) {
            mem[size][limit] = Math.max((values[size-1] + knapSack(limit-weights[size-1], weights, values, size-1)),
                knapSack(limit, weights, values, size-1));
        } else if (weights[size-1] > limit) {
            mem[size][limit] = knapSack(limit, weights, values, size-1);  
        }
        return mem[size][limit];
    }
}
