import java.util.List;
import java.util.Scanner;

public class TestTank {
    public static void main(String[] args) {
        Tank t1 = new Tank("Tank 1",20,20);
//        System.out.println(t1.dealDamage());

        while(t1.getTank2Health() != 0) {
            System.out.println("Make a move(dealDamage):");
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.nextLine().toLowerCase();
            System.out.printf("your enemy is on coordinates x:%d, y:%d \n",t1.getxPositie(), t1.getyYositie());

            if (input.equals("dealdamage")) {
                System.out.println("Choose enemy (name): ");
                String target = keyboard.nextLine();
                System.out.println("Choose a angle: ");
                int angle = keyboard.nextInt();
                t1.setAngle(angle);
                System.out.println("Choose a velocity: ");
                int vel = keyboard.nextInt();
                t1.setAngle(vel);
                System.out.println(t1.dealDamage(target));
            } else {
                while (!input.equals("dealdamage")) {
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
