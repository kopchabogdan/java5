import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean b = ((Math.random() * 5) > 3) ? true : false;
        System.out.println("TASK 1: " + b);
        Random random = new Random();
        System.out.println("TASK 2:");
        int first = random.nextInt(50);
        int second = random.nextInt(50);
        int third = random.nextInt(50);
        System.out.println("Numbers:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
        System.out.println("Third: " + third);
        if (first > second) {
            if (first > third)
                System.out.println("First number is the highest!");
            else
                System.out.println("First number is the highest!");
        } else {
            if (second > third)
                System.out.println("Second number is the highest!");
            else
                System.out.println("Third number is the highest!");
        }
        System.out.println("TASK 3:");
        System.out.println("Enter a line: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println("Line: " + line);
        System.out.println("Line has numbers: " + line.matches(".*\\d.*"));
    }
}