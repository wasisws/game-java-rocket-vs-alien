import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayPage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayPage1 extends World
{
    public static Counter score = new Counter("Score : ");
    /**
     * Constructor for objects of class PlayPage1.
     * 
     */  
    public PlayPage1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepareRocket();
        addObject(score, 830, 30);
        score.setValue(0);
    }

    private void prepareRocket() {
        Greenfoot.delay(50);
        Rocket rocket = new Rocket();
        addObject(rocket, 100, 300);
    }

    public void act() {
        if (Greenfoot.getRandomNumber(400) < 2) {
            Greenfoot.delay(0);
            Alien1 alien1 = new Alien1();
            addObject(alien1, getWidth(), Greenfoot.getRandomNumber(getHeight()));
            
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
