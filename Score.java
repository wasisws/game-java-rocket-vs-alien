import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public Score()
    {
        // Add your action code here.
        score = 0;
    }
    public void act(){
        World myWorld = getWorld();
        myWorld.showText("Poin Kill : "+String.valueOf(score), 830, 10);
    }
    public static void add(int num){
        score += num;
    }   
}
