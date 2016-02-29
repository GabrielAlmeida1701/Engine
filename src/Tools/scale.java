package Tools;

import Sys.Main;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class scale extends tool{
    
    Point start;
    int tamS;
    
    BufferedImage x,y;
    
    public scale(){
        
    }
    
    @Override
    public void useTool(Point e, Main main) {
        if(select != null){}
    }
    
    private void redim(String eixo, Point e){
        switch(eixo){
            case("+x"):
                
            break;
            case("-x"):
                float dist = (float) start.distance(e);
                if((start.x - e.x) > 0){
                    int newT = (int) (tamS + dist);
                    select.scale.width = newT;
                    select.boxC.width = newT;
                }else{
                    int newT = (int) (tamS - dist);
                    select.scale.width = newT;
                    select.boxC.width = newT;
                }
            break;
            case("+y"):
                
            break;
            case("-y"):
                
            break;
        }
    }

    @Override
    public void draw(Graphics g) {
        if(select != null){
            
        }
    }

    @Override
    public void frstClick(Point e) {
        start = e;
        
        if(select != null)
            tamS = select.boxC.width;
    }
    
}
