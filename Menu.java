import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MainMenu());
        }
    }
    public Menu(){
        GreenfootImage image = getImage();
        image.scale(150, 93);
    }
}
