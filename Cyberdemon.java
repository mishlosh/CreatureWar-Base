
/**
 * A powerful demonic creature
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public class Cyberdemon extends Demon
{
    private static int minhp = 25;
    private static int maxhp = 100;
    private static int minstr = 20;
    private static int maxstr = 40;
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(minhp,maxhp,minstr,maxstr);
    }
}
