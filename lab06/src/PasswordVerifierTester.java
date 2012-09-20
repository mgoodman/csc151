
public class PasswordVerifierTester {

    public static void main(String[] args) {
        PasswordVerifier pv = new PasswordVerifier("aE#%3e4");
        pv.strengthen();
        System.out.println(pv.getPassword());
    }

}
