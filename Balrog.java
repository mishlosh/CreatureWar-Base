import java.util.Random;
/**
 * Write a description of class Balrog here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage()
    {
        Random rand = new Random();
        int dmg = rand.nextInt(strength)+1;
        dmg += rand.nextInt(strength)+1;
        return dmg;
    }
}
