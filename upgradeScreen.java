import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class upgradeScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class upgradeScreen extends preview
{
    
    int upgrade=1;
    int switchCD;
    int buyCD;
    space i;int soundCD2;
    /**
     * Act - do whatever the upgradeScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        imageSwitch2();
        dewIt();if(soundCD2>0)soundCD2--;
    }    
    public void imageSwitch2(){
        if(active==true)
        {if(upgrade==1)
            this.setImage("upgradescreen1.png");
        else if(upgrade==2)
            this.setImage("upgradescreen2.png");
        else if(upgrade==3)
            this.setImage("upgradescreen3.png");
        else if(upgrade==4)
            this.setImage("upgradescreen4.png");
       else if(upgrade==5)
            this.setImage("upgradescreen5.png");
    }
        
        else
          this.setImage("xxx.png");
        }
    public void dewIt(){
        if(active==true){
        if(switchCD==0){
        
          if(upgrade==1&&Greenfoot.isKeyDown("s")){
         upgrade=4;switchCD=15;}
         else if(upgrade==1&&Greenfoot.isKeyDown("a")){
         upgrade=3;switchCD=15;}
          else if(upgrade==1&&Greenfoot.isKeyDown("d")||upgrade==2&&Greenfoot.isKeyDown("d")){
         upgrade++;switchCD=15;}
         else if(upgrade==2&&Greenfoot.isKeyDown("a")){
         upgrade=1;switchCD=15;}
         else if(upgrade==3&&Greenfoot.isKeyDown("d")){
             upgrade=1;
             switchCD=15;
            }
            else if(upgrade==4&&Greenfoot.isKeyDown("s")){
             upgrade=1;
             switchCD=15;
            }
            else if(upgrade==3&&Greenfoot.isKeyDown("a")){
             upgrade=2;
             switchCD=15;
            }
            else if(upgrade==4&&Greenfoot.isKeyDown("w")){
             upgrade=1;
             switchCD=15;
            }
            else if(upgrade==1&&Greenfoot.isKeyDown("w")){
             upgrade=4;
             switchCD=15;
            }
            else if(upgrade==3&&Greenfoot.isKeyDown("a")){
             upgrade=2;
             switchCD=15;
            }
            else if(upgrade==2&&Greenfoot.isKeyDown("s")){
             upgrade=5;
             switchCD=15;
            }
            else if(upgrade==5&&Greenfoot.isKeyDown("s")){
             upgrade=2;
             switchCD=15;
            }
            else if(upgrade==5&&Greenfoot.isKeyDown("a")){
             upgrade=4;
             switchCD=15;
            }
            else if(upgrade==4&&Greenfoot.isKeyDown("a")){
             upgrade=5;
             switchCD=15;
            }
            else if(upgrade==4&&Greenfoot.isKeyDown("d")){
             upgrade=5;
             switchCD=15;
            }
            else if(upgrade==5&&Greenfoot.isKeyDown("d")){
             upgrade=4;
             switchCD=15;
            }
            else if(upgrade==5&&Greenfoot.isKeyDown("w")){
             upgrade=2;
             switchCD=15;
            }
            else if(upgrade==2&&Greenfoot.isKeyDown("w")){
             upgrade=5;
             switchCD=15;
            }
            
         if(Greenfoot.isKeyDown("space")&&buyCD==0){
            
            if(upgrade==1 && i.material>=25 && i.material2>=5)
            {i.player.reactorUpgrades++;buyCD=30;
               i.material=i.material-25; 
               i.material2=i.material2-5; 
            }
            else if(upgrade==2 && i.material>=40 && i.material2>=4)
            {i.player.maxEnergy=i.player.maxEnergy+2000;buyCD=30;
                i.material=i.material-40; 
               i.material2=i.material2-4; 
            }
            else if(upgrade==3 && i.material>=250 && i.material2>=15)
            {i.player.raketen=true;buyCD=30;i.material=i.material-250; 
               i.material2=i.material2-15; 
            }
            else if(upgrade==4 && i.material>=300 && i.material2>=25)
            {i.player.WarpMod=true;buyCD=30;
                i.material=i.material-300; 
               i.material2=i.material2-25; 
            }
            else if(upgrade==5 && i.material>=30 && i.material2>=8)
            {i.player.RadarMod++;buyCD=30;
                i.material=i.material-30; 
               i.material2=i.material2-8; 
            }
            else if(soundCD2==0){
                        Greenfoot.playSound("rer.mp3");
                        soundCD2=15;
                    }
            
        }
        
            
            
        }
        
        if(switchCD>0)switchCD--;
        if(buyCD>0)buyCD--;
        
    }
}
     
}
