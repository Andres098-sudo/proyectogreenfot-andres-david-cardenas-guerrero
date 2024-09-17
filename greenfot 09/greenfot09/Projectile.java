import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot, and MouseInfo)

public class Projectile extends Actor
{
    private int speed = 10;  // Velocidad del proyectil

    public Projectile()
    {
        // Constructor por defecto
    }

    public void act()
    {
        move(speed);
        removeFromWorld();
    }

    private void removeFromWorld()
    {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
    public void setDirection(int direction)
    {
        setRotation(direction);
    }
}

