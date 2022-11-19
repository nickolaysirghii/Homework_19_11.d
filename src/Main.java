import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner fish = new Scanner(System.in);
        String shark = fish.nextLine();
        int weil = shark.length();
        int nemo = 0;
        String answer = shark.substring(0, 1);
        while (nemo < weil) {
            nemo++;
            System.out.println(answer);
        }
    }
}







