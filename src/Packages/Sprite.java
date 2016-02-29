package Packages;

import java.io.File;
import FileControl.ImageFilter;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Sprite {
    
    public int larg, alt;
    
    public BufferedImage image;
    public boolean hasAnimation;
    public boolean isPlaying;
    public boolean hasFinish;
    public boolean loop;
    
    private ArrayList<String> animations;
    
    public static int STOP_START = 0;
    public static int STOP_ALL = 1;
    public static int STOP_START_ALL = 2;
    
    public Sprite(File spriteBase){
        boolean isImage = ImageFilter.formatAccept(spriteBase.getName());
        
        if(isImage){
            try {
                image = ImageIO.read(spriteBase);
                larg = image.getWidth()/3;
                alt = image.getHeight()/3;
            } catch (IOException ex) {
                
            }
        }
    }
    
    public void Play(){
        if(!hasAnimation)
            return;
        
    }
    
    public void Play(String anim){
        if(!hasAnimation || !animations.contains(anim))
            return;
        
    }
    
    public void addClip(int width, int height, int lenght, String name){}
    
    public void Stop(int stopType){}
    
    public Dimension getDim(){return new Dimension(larg, alt);}
}
