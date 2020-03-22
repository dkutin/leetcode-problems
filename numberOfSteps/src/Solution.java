class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        while (true) {
            if (num == 0) {
                return count;
            }
            else if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
    }
}