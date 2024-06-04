import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPage extends World
{

    /**
     * Constructor for objects of class HelpPage.
     * 
     */
    public HelpPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepareMenu();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepareMenu()
    {
        Menu menu = new Menu();
        addObject(menu,80,550);
        
        showText("Petunjuk bermain Game Space", 450, 100);
        showText("Tombol 'up'     : Digunakan untuk menggerakkan object ke atas", 450, 200);
        showText("Tombol 'down'   : Digunakan untuk menggerakkan object ke bawah", 469, 220);
        showText("Tombol 'right'  : Digunakan untuk menggerakkan object ke kanan", 461, 240);
        showText("Tombol 'left'   : Digunakan untuk menggerakkan object ke kiri", 442, 260);
        showText("Tombol 'scapce' : Digunakan untuk menembak", 376, 280);
    }
}
