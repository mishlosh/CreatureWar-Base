import java.util.Random;
import java.util.ArrayList;
/**
 * Simulates a battle between two armies using the various creatures
 *
 * @author Michal Legocki
 * @version 11/19/18
 */
public class Battle
{
    private ArrayList<Creature> good;
    private ArrayList<Creature> evil;
    private Random rand;
    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        good = new ArrayList<Creature>();
        evil = new ArrayList<Creature>();
        rand = new Random();
    }

    /**
     * Populates the two armies
     */
    public void setupArmies()
    {
        int humans = 50;
        int elves = 50;
        int cyberdemons = 8;
        int balrogs = 2;
        
        for(int c=0; c<humans; c++){
            good.add(new Human());
        }
        for(int c=0; c<elves; c++){
            good.add(new Elf());
        }
        for(int c=0; c<cyberdemons; c++){
            evil.add(new Cyberdemon());
        }
        for(int c=0; c<balrogs; c++){
            evil.add(new Balrog());
        }
        
    }
    
    /**
     * Has the two armies fight until one of them is exterminated
     */
    public void fight()
    {
        int c = 0;
        while (!good.isEmpty() && !evil.isEmpty()){
            c = 0;
            while (good.size() > c  && evil.size() > c){
                good.get(c).takeDamage(evil.get(c).damage());
                evil.get(c).takeDamage(good.get(c).damage());
                
                if(good.get(c).isDead()){
                    good.remove(c);
                }
                if(evil.get(c).isDead()){
                    evil.remove(c);
                }
                
                c++;
            }
            
        }
    }
    
    /**
     * reports which army won
     */
    public void report()
    {
        if (good.isEmpty() && evil.isEmpty()){
            System.out.println("Both forces are dead");
        }else if (good.isEmpty()){
            System.out.println("Evil Wins");
        }else if (evil.isEmpty()){
            System.out.println("Good Wins");
        }
    }
}
