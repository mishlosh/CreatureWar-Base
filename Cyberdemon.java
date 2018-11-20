
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cyberdemon extends Demon
{
    private static int minhp = 80;
    private static int maxhp = 200;
    private static int minstr = 50;
    private static int maxstr = 40;
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(minhp,maxhp,minstr,maxstr);
    }
}
