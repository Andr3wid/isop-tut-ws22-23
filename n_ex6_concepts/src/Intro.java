public class Intro {
    public static void main(String[] args) {
        String sentence = "Hi my friends";

        System.out.println(sentence.charAt(0));

        String[] words = sentence.split("");

        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());

        String halfSentence = sentence.substring(0, sentence.length()/2);
        System.out.println(halfSentence);

        String uglyTomato = "         Tomato    ";
        String beautifulTomato = uglyTomato.trim();
        System.out.println(beautifulTomato);

        System.out.println("=========");
    }
}
