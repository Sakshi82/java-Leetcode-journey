class Solution {
    public int xorOperation(int n, int start) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int value = start + 2 * i;
            answer = answer ^ value;
        }
        return answer;
    }
}
