class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            int words = 1;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    words++;
                }
                if (words > max) {
                    max = words;
                }
                //return max;
            }
        }
        return max;
    }
}
