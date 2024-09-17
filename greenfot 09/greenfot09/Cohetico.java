import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot, and MouseInfo)

public class Cohetico extends Actor
{
    private boolean canFire = true;
    private static final int MOVE_SPEED = 5;  // Velocidad de movimiento
    private static final int ROTATE_SPEED = 5;  // Velocidad de rotación

    public Cohetico()
    {
        // Constructor por defecto
    }
    
    public void act()
    { 
        handleMovement();
        handleRotation();
        fireProjectile();
    }
    
    // Método para mover el cohetico
    private void handleMovement()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(MOVE_SPEED);
        }
    }

    // Método para rotar el cohetico
    private void handleRotation()
    {
        if (Greenfoot.isKeyDown("a")) {
            setRotation(getRotation() - ROTATE_SPEED);  // Rotar a la izquierda
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(getRotation() + ROTATE_SPEED);  // Rotar a la derecha
        }
        if (Greenfoot.isKeyDown("s")) {
            // Girar en sentido opuesto al de avance
            setRotation(getRotation() + 180);  
            move(MOVE_SPEED);
            setRotation(getRotation() - 180);  // Volver a la rotación original
        }
    }
    
    // Método para disparar proyectiles
    private void fireProjectile()
    {
        if (Greenfoot.isKeyDown("space") && canFire) {
            // Crear el proyectil y añadirlo al mundo
            Projectile projectile = new Projectile();
            getWorld().addObject(projectile, getX(), getY());
            projectile.setDirection(getRotation());
            canFire = false;
        } else if (!Greenfoot.isKeyDown("space")) {
            canFire = true;   
        }
    }
}











