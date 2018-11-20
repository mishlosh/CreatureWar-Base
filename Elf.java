import java.util.Random;
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
