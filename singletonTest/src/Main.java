public class Main {


    public static void main(String[] args) {
        System.out.println("something");
        GameSettings settings1 = GameSettings.getInstance(
                "hard", "english"
        );
        GameSettings settings2 = GameSettings.getInstance(
                "easy", "Arabic"
        );



        System.out.println(settings1 == settings2);
        System.out.println(settings1.equals(settings2));


    }
}
