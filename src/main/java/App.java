import lombok.*;

import java.util.Scanner;

@Getter
@Setter
public class App {
    public static void main(String[] args) {
        // це ідентичний код що і в App від MavEmpty
        // ця помітка для логіну і паролю просто для того щоб ви бачили що потрібно вводити
        //  логін = log = "lg1505";
        //  пароль = password = "MavenHeaven";

        Scanner in = new Scanner(System.in);

        Service service = new Service();
        Login login = new Login();

        // введеня логіну
        System.out.println("Enter your login: ");
        String logNew = in.nextLine();

        // перевірка логіну через цикл
        while (!logNew.equals(login.getLog())) {
            System.out.println("It is incorrect, try again.");
            System.out.println("Enter your login: ");
            logNew = in.nextLine();
        }

        // введеня паролю
        System.out.println("Enter your password: ");
        String passwordNew = in.nextLine();

        // авнвлогічна перевірка для паролю
        while (!passwordNew.equals(login.getPassword())) {
            System.out.println("It is incorrect, try again.");
            System.out.println("Your password: ");
            passwordNew = in.nextLine();
        }

        in.close();

        // просте вітання і вивід данних
        service.setMessage("Hello!");
        System.out.printf("This is your name: ");
        System.out.println(service.getName());
        System.out.printf("This is your age: ");
        System.out.println(service.getAge());
        System.out.printf("This is your age: ");
        System.out.println(service.getHeight());
        System.out.printf("This is your dick size: ");
        System.out.println(service.getDickSize());
    }

}
