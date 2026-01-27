public class VulnerableDemo {

    public static void main(String[] args) throws Exception {

        // Vulnerability 1: OS Command Injection
        Runtime.getRuntime().exec(args[0]);

        // Vulnerability 2: Hardcoded Credential
        String password = "admin123";

        // Vulnerability 3: Path Traversal
        new java.io.FileInputStream(args[1]);
    }
}
