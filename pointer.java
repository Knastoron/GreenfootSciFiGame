import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pointer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pointer extends moveWithWorld
{
    int maxDistance;
    GreenfootImage I = this.getImage();
    Enemy tt;
    /**
     * Act - do whatever the pointer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        allIn();
        showOff();
        turnTowards(koordGeber.spielerReturn().getX(),koordGeber.spielerReturn().getY());
    }  
    public void align(){
        if(tt!=null)
        this.setLocation(tt.getX(),tt.getY());
        else
        getWorld().removeObject(this);
        
    }
    public void showOff(){
       
          if(distanceToPlayer<670){ 
        setImage("xxx.png");
      }
      else{
       setImage(I);
       // getWorld().showText("Distance"+(int)distanceToPlayer, this.getX(),this.getY());
     }
    
    
   }
   public void enemyShowOff(){
       int nX=getX();
       int nY=getY();
          if(tt.distanceToPlayer<300){ 
        setImage("xxx.png");
    }
    else if((tt.distanceToPlayer>300&&tt.distanceToPlayer<koordGeber.spielerReturn().RadarMod*2000))
    {setImage(I);
     // getWorld().showText("Distance"+(int)distanceToPlayer, this.getX(),this.getY());
    }
    else if(tt.distanceToPlayer>koordGeber.spielerReturn().RadarMod*2000)
    setImage("xxx.png");
   }
   
}
