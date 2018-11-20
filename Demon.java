import java.util.Random;
/**
 * A demonic creature (abstract)
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public abstract class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     * 
     * @param int minHP
     * @param int maxHP
     * @param int minSTR
     * @param int maxSTR
     */
    public Demon(int minhp, int maxhp, int minstr, int maxstr)
    {
        super(minhp,maxhp,minstr,maxstr);
    }

    /**
     * Calculates how much damage their attack deals
     * overrides Creature's damage
     * random number between 1 and strength
     * 5% chance of +50 damage
     *
     * @return  damage dealt by attack
     */
    public int damage()
    {
        Random rand = new Random();
        int dmg = rand.nextInt(strength)+1;
        if(rand.nextInt(20)<1)
        {
            dmg+=50;
        }
        return dmg;
    }
}
