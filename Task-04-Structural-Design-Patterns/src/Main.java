public class Main {

    public static void main(String[] args) {
        System.out.println("something");

        OldSystemAPI oldSystemAPI = new OldSystemAPI();
        oldSystemAPI.call();

        NewSystemAPI newSystemAPI = new NewSystemAPI();
        newSystemAPI.makeCall();
    }
}
