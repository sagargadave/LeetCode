class Solution {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        StringBuilder suffix = new StringBuilder("a"); 

        for (String word : words) {
            char first = word.charAt(0);
            if (vowels.indexOf(first) != -1) {
                result.append(word);
            } else {
                result.append(word.substring(1)).append(first);
            }
            result.append("ma").append(suffix).append(' ');
            suffix.append('a');
        }

        result.setLength(result.length() - 1);
        return result.toString();
    }
}