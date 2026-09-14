class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas = 0, tCost = 0;
         int currentGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            tGas += gas[i];
            tCost += cost[i];
        }

        if (tGas <tCost) {
            return -1;
        }

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;        
    }
}