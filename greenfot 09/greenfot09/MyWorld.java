import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot, and MouseInfo)

/**
 * MyWorld is the main class for the game world.
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Create a Cohetico object and add it to the world
        Cohetico cohete = new Cohetico();
        addObject(cohete, getWidth() / 2, getHeight() / 2);
    }
}





