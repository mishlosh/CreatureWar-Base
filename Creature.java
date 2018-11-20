import java.util.Random;

/**
 * Base Creature class for all creatures in creaturewar
 * 
 * @author Michal Legocki
 * @version 11/19/18
 */
public abstract class Creature
{
    protected int hp;
    protected int strength;
   
    /**
     * constructor for the creature class
     */
    public Creature(){
       hp = 10;
       strength = 10;
    }
   
    /**
     * constructor for every creature
     * 
     * @param int minHP
     * @param int maxHP
     * @param int minSTR
     * @param int maxSTR
     */
    public Creature(int minhp, int maxhp, int minstr, int maxstr){
        Random rand = new Random();
        hp = rand.nextInt(maxhp-minhp)+1+minhp;
        strength = rand.nextInt(maxstr-minstr)+1+minstr;
    }
    
    /**
     * Calculates how much damage their attack deals
     * random number between 1 and strength
     *
     * @return  damage dealt by attack
     */
    public int damage(){
        Random rand = new Random();
        return rand.nextInt(strength)+1;
    }
    
    /**
     * Decreases HP by damage taken
     * 
     * @param   int dmg Damage taken
     */
    public void takeDamage(int dmg)
    {
        hp -= dmg;
    }
    
    /**
     * reports if the creature is alive
     * 
     * @return boolean alive
     */
    public boolean isAlive()
    {
       if (hp > 0)
       {
           return true;
        }else{
            return false;
        }
    }
    
    /**
     * reports if the creature is dead
     * 
     * @return boolean dead
     */
    public boolean isDead()
    {
        if (hp <= 0)
        {
            return true;
        }else{
            return false;
        }
    }
    
}
