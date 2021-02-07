import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int l = input.length();
        int amount = 0;

        if (l != 0) {
            amount++;
            for (int i = 0; i < l; i++) {
                if (input.charAt(i) == ' ') {
                    amount++;
                }
            }
        }
        System.out.println(amount);
    }
}