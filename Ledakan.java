import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ledakan extends Actor
{
    /**
     * Act - do whatever the Ledakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int jeda = 5;
    public void act()
    {
        // Add your action code here.
        if (jeda > 0 ){
            jeda--;
        }else{
            getWorld().removeObject(this);
        }
        Ledakan();
    }
    public void Ledakan(){
        GreenfootImage image = getImage();
        image.scale(90, 90);
    }
}
