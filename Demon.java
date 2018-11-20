import java.util.Random;
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Demon extends Creature
{
    
    public Demon(int minhp, int maxhp, int minstr, int maxstr)
    {
        super(minhp,maxhp,minstr,maxstr);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
