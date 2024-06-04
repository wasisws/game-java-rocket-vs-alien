import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MulaiUlang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MulaiUlang extends Actor
{
    /**
     * Act - do whatever the MulaiUlang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(5);
            Greenfoot.setWorld(new PlayPage1());
        }
    }
    public MulaiUlang(){
        GreenfootImage image = getImage();
        image.scale(90, 90);
    }
}
