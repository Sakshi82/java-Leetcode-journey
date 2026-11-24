import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String[] firstWords = Arrays.copyOfRange(words, 0, k);
        return String.join(" ", firstWords);
    }
}
