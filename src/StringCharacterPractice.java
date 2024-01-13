public class StringCharacterPractice {

    public static void main(String[] args) {
        String message = "Hello, World!";
//    use .charAT();

        String fav_quote = "As long as I continue the fight no matter how many times I fail, " +
                "I will always be winning";
        System.out.println(message.length());
        System.out.println(fav_quote.charAt(9)); // start at 0 so you go to 9 if you want the 10th index
    }
}
