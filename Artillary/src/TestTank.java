import java.util.List;
import java.util.Scanner;

public class TestTank {
    public static void main(String[] args) {
        Tank t1 = new Tank("Tank 1");
//        System.out.println(t1.dealDamage());

        while(t1.getTank2Health() != 0) {
            System.out.println("Make a move:");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine();


            if (input.equals("dealDamage")) {
                System.out.println("Choose a target(choose name)");
                String target = keyboard.nextLine();
                System.out.println(t1.dealDamage(target));
            } else {
                while (!input.equals("dealDamage")) {
                    System.out.println("Not a valid move, the current moves are:");
                    System.out.println("dealDamage");
                    input = keyboard.nextLine();
                    if (input.equals("dealDamage")) {
                        System.out.println("Choose a target");
                        String target = keyboard.nextLine();
                        System.out.println(t1.dealDamage(target));
                    }
                }
            }
        }
    }
}
