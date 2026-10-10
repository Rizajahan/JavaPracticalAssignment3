
import java.util.Scanner;

class UniversityLog {
    void login(String username) {
        try {
            if (username == null) {
                throw new NullPointerException(
                        "Username cannot be null"
                );
            }

            System.out.println("Login Successful");
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.equals("null")) {
            username = null;
        }

        UniversityLog u = new UniversityLog();
        u.login(username);

        sc.close();
    }
}
