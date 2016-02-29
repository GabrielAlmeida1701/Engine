package Telas;

import Packages.Elemento;
import Tools.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Screen implements MouseListener, MouseMotionListener{
    
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    public ArrayList<Elemento> elementos = new ArrayList<>();
    public Elemento selectElm = null;
    public Meio meio;
    public tool ferr;
    
    Image cursorM;
    Cursor move;
    
    public Screen(){
        cursorM = toolkit.getImage(getClass().getResource("/resource/mouse/move.gif"));
        
        move = toolkit.createCustomCursor(cursorM, new Point(0,0), "move cursor");
    }
    
    public void update(){
        if(ferr != null && ferr instanceof drag)
            meio.setCursor(move);
        else
            meio.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
    
    public void selectTool(String type){
        if(type.equals("drag"))
            ferr = new drag();
        if(type.equals("scale"))
            ferr = new scale();
    }
    
    public void draw(Graphics2D g){
        elementos.stream().forEach(elms -> {
            elms.draw(g);
        });
        
        if(selectElm != null){
            g.setColor(Color.blue);
            
            g.drawRect(selectElm.position.x-5, selectElm.position.y-5,
                    selectElm.scale.width+10, selectElm.scale.height+10);
        }
        
        if(ferr != null)
            ferr.draw(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON3){
            ferr = null;
            meio.main.backTool();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       tool.selectItem(elementos, meio.main, e.getPoint());
       selectElm = tool.getSelected();
       
       if(ferr != null)
           ferr.frstClick(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        if(ferr != null)
            ferr.useTool(e.getPoint(), meio.main);
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {}
    
}
