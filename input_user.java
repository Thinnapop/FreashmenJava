import java.util.Scanner;

public class input_user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("how old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your fav food?");
        String food = scanner.nextLine();

        System.out.println("Hello,"+name);
        System.out.println("you are"+age+"years old");
        System.out.println("Oh nice I love"+food+"too");
    }
    
}
