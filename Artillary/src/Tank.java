import java.util.Random;

public class Tank {
    private int tank2Health = 100;
    private Random rnd = new Random();
    private String playerName;


    public Tank(String playerName)
    {
        this.playerName = playerName;
    }

    public String dealDamage(String target)
    {
        int damage = rnd.nextInt(15) + 20;
        tank2Health -= damage;
        if(tank2Health <= 0)
        {
            tank2Health = 0;
            return String.format("%d damage dealt to %s %n%s has %d health left%n%s has died", damage, target, target, tank2Health ,target);
        }
        return String.format("%d damage dealt to %s %n%s has %d health left", damage, target, target, tank2Health);
    }

    public int getTank2Health() {
        return tank2Health;
    }

}
