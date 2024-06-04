import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int jeda = 2;
    public void gerak(){
        setLocation(getX()-2, getY());
        if (getX() <= 0 ){
            getWorld().removeObject(this);
            Greenfoot.playSound("gameOver.mp3");
            Greenfoot.setWorld(new LoseGame());
        }
    }
    public void tembakAlien(){
        // Add your action code here.
        if(jeda>0){
            jeda--;
        }
        if(jeda==1){
            getWorld().addObject(new tembakanAlien(), getX()-50, getY());
        }
        if(jeda==0){
            jeda=200;
        }
    }
}
