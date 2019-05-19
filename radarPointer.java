import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class radarPointer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class radarPointer extends pointer
{
    
    /**
     * Act - do whatever the radarPointer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int t=tt.leben;
        if(t>0&&tt!=null)
        setLocation(tt.getX(),tt.getY());
        else 
        gehSterben=true;
        
        allIn();
       align();
        enemyShowOff();
        
        turnTowards(koordGeber.spielerReturn().getX(),koordGeber.spielerReturn().getY());
       
    }    
}
