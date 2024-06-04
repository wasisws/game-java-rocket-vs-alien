import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tembakanAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tembakanAlien extends Actor
{
    /**
     * Act - do whatever the tembakanAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(-3);
        setLocation(getX(), getY());
        if (getX() <= 0 ){
            getWorld().removeObject(this);
        }else if(isTouching(Rocket.class)){
            removeTouching(Rocket.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("gameOver.mp3");
            Greenfoot.setWorld(new LoseGame());
            Greenfoot.stop();
            PlayPage1.score.setValue(0);
        }
    }
    public tembakanAlien(){
        GreenfootImage image = getImage();
        image.scale(40, 25);
    }
}
