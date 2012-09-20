
public class PasswordVerifierTester {

    public static void main(String[] args) {
        PasswordVerifier pv = new PasswordVerifier("ea3eEe");
        System.out.println(pv.isValid());
    }

}
