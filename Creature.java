import java.util.Random;

/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Creature
{
   protected int hp;
   protected int strength;
   
   public Creature(){
       hp = 10;
       strength = 10;
   }
   
   public Creature(int minhp, int maxhp, int minstr, int maxstr){
       Random rand = new Random();
       hp = rand.nextInt(maxhp-minhp)+1+minhp;
       strength = rand.nextInt(maxstr-minstr)+1+minstr;
   }
    
   public int damage(){
       Random rand = new Random();
       return rand.nextInt(strength)+1;
    }
    
   public boolean isAlive()
   {
       if (hp > 0)
       {
           return true;
        }else{
            return false;
        }
    }
    
}
