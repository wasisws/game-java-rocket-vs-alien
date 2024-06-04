import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseGame extends World
{

    /**
     * Constructor for objects of class LoseGame.
     * 
     */
    public LoseGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        GameOver gameover = new GameOver();
        addObject(gameover, 450, 300);
        
        Menu menu = new Menu();
        addObject(menu, 380, 540);

        MulaiUlang ulang = new MulaiUlang();
        addObject(ulang, 520, 540);
  
    }
}
