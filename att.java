import java.util.Scanner;

public class att {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many time do you enter the class");
        int present = scanner.nextInt();
        
        System.out.println("How many time do you late");
        int late = scanner.nextInt();
        
        System.out.println("How many time do you absent");
        int absent = scanner.nextInt();
        
        double sumAttendance = present * 0.8;
        double sumLate = late / 2;
        double aveAttendance = present - absent - sumLate;
        

        if (aveAttendance >= sumAttendance){
            System.out.println("The student can take the exam");
        }
        else {
            System.out.println("The student cannot take the exam");
        }
        scanner.close();
        }
    }

