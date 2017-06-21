package Packages;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.File;

public class Elemento {
    private File me;
    
    String name;
    
    public Point position = new Point(0, 0);
    public Dimension scale;
    public Rectangle boxC;
    
    Sprite sprite;
    AffineTransform af = new AffineTransform();
    
    public Elemento(String nome, File me){
        name = nome;
        this.me = me;
        
        sprite = new Sprite(me);
        scale = sprite.getDim();
        
        boxC = new Rectangle(
                                position.x,
                                position.y,
                                scale.width,
                                scale.height
                            );
    }
    
    public void draw(Graphics2D g){
        af.setToScale(0.3, 0.3);
        
        //af.translate(position.x, position.y);
        
        g.drawImage(sprite.image, position.x, position.y, sprite.larg, sprite.alt,null);
    }
    
    public void changeVals(int val, String type){        
        switch(type){
            case("PX"):
                position.x = val;
                atualizaCol();
            break;
            case("PY"):
                position.y = val;
                atualizaCol();
            break;
        }
    }
    
    private void atualizaCol(){
        boxC = new Rectangle(
                                position.x,
                                position.y,
                                scale.width,
                                scale.height
                            );
    }
    
    
    @Override
    public String toString(){
        return "Elemento: X:"+position.x+", Y: "+position.y;
    }
}
