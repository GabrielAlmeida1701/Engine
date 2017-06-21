package Tools;

import Packages.Elemento;
import Packages.GameObject;
import Sys.Main;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

public abstract class tool {
    
    static Elemento select;
    
    static GameObject selectGO;
    
    public static Elemento selectItem(ArrayList<Elemento> elementos, Main main, Point e){
        int i = 0;
        for(Elemento elms: elementos){
            Rectangle box = elms.boxC;
            box.x -= 10; box.y -= 10; box.width += 20; box.height += 20;
            
            if(box.contains(e)){
                select = elms;
                main.setTransformValues(select.position.x, select.position.y,
                                    select.scale.width, select.scale.height);
            }else
                i++;
            
            if(i == elementos.size())
                select = null;
        }
        
        return select;
    }
    
    public static Elemento getSelected(){return select;}
    
    public static void deselectItem(){
        select = null;
    }
    
    public abstract void Tool_Click(Point e);
    
    public abstract void useTool(Point e, Main main);
    
    public abstract void ReleaseTool();
    
    public abstract void draw(Graphics g);
    
    protected void print(Object o){
        System.out.println(o.toString());
    }
}
