import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        setLocation(getX(), getY());
        if (getX() >= 899 ){
            getWorld().removeObject(this);
        }else if(isTouching(Alien1.class)){
            Greenfoot.playSound("SuaraHit.wav");
            removeTouching(Alien1.class);
            getWorld().addObject(new Ledakan(), getX(), getY());
            getWorld().removeObject(this);
            PlayPage1.score.add(1);
        }
    }
}
