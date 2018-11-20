import java.util.Random;
/**
 * An extremely powerful demonic creature
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public class Balrog extends Demon
{
    private static int minhp = 80;
    private static int maxhp = 200;
    private static int minstr = 50;
    private static int maxstr = 100;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(minhp,maxhp,minstr,maxstr);
    }

    /**
     * Calculates how much damage their attack deals
     * Overrides Demon's damage()
     * random number between 1 and strength
     * attacks twice
     *
     * @return  damage dealt by attacks
     */
    public int damage()
    {
        Random rand = new Random();
        int dmg = rand.nextInt(strength)+1;
        dmg += rand.nextInt(strength)+1;
        return dmg;
    }
}
