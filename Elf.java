import java.util.Random;
/**
 * A magical creature
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public class Elf extends Creature
{
    private static int minhp = 8;
    private static int maxhp = 25;
    private static int minstr = 5;
    private static int maxstr = 18;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(minhp,maxhp,minstr,maxstr);
    }
    
    /**
     * Calculates how much damage their attack deals
     * Overrides creature's damage()
     * random number between 1 and strength
     * 10% chance of double damage
     *
     * @return  damage dealt by attack
     */
    public int damage()
    {
        Random rand = new Random();
        int dmg = rand.nextInt(strength)+1;
        if (rand.nextInt(10)<1)
        {
            dmg = 2 * dmg;
        }
        return dmg;
    }
}
