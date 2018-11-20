
/**
 * A basic creature
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public class Human extends Creature
{
    private static int minhp = 10;
    private static int maxhp = 30;
    private static int minstr = 5;
    private static int maxstr = 18;
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super(minhp,maxhp,minstr,maxstr);
    }
}
