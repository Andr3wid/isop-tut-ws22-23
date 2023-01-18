public class Ex01 {

    static String longestString(String[] words) {
        if(words == null || words.length == 0) {
            return "";
        }

        String longestFoundWord = words[0];

        for(int i = 1; i < words.length; i++) {
            if(words[i].length() > longestFoundWord.length()) {
                longestFoundWord = words[i];
            }
        }

        return longestFoundWord;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "today", "superlongword", "cucumber"};

        String longestWord = longestString(words);

        System.out.println(longestWord);
    }
}
