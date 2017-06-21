package Tools;

import Sys.Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class scale extends tool{
    
    Point start;
    Point gizmosPos;
    
    Rectangle xAxis, yAxis;
    
    BufferedImage x,y;
    
    private String axisType = "X";
    
    public scale(){ }
    
    @Override
    public void Tool_Click(Point e){
        if(xAxis.contains(e))
            axisType = "X";
            
        if(yAxis.contains(e))
            axisType = "Y";
        
        start = e;
        fixedSize = select.scale;
    }
    
    float dist;
    int dir = 1;
    Dimension fixedSize;
    
    @Override
    public void useTool(Point e, Main main) {
        if(select != null){
            select.scale = fixedSize;
            dist = (float)Point.distance(e.x, e.y, start.x, start.y);
            
            if(axisType.equals("X")){
                if(e.x < start.x) dir = -1;
                else dir = 1;
            }
            
            if(axisType.equals("Y")){
                if(e.y < start.y) dir = -1;
                else dir = 1;
            }
            print("shake");
            //select.scale.width += dist * dir;
        }
    }

    @Override
    public void ReleaseTool(){
        print(dist);
        select.scale.width += dist * dir;
    }
    
    @Override
    public void draw(Graphics g) {
        if(select != null){
            if(gizmosPos == null) createGizmos();
            
            g.setColor(Color.red);
            g.drawLine(gizmosPos.x, gizmosPos.y, gizmosPos.x+30, gizmosPos.y);
            g.fillRect(xAxis.x, xAxis.y, xAxis.width, xAxis.height);
            
            g.setColor(Color.green);
            g.drawLine(gizmosPos.x, gizmosPos.y, gizmosPos.x, gizmosPos.y-30);
            g.fillRect(yAxis.x, yAxis.y, yAxis.width, yAxis.height);
        }
    }
    
    private void createGizmos(){
        Point p = select.position;
        gizmosPos = new Point(
            p.x + select.boxC.width/2,
            p.y + select.boxC.height/2
        );
        
        print(select.boxC.width);
        
        xAxis = new Rectangle(gizmosPos.x+30, gizmosPos.y-10, 20, 20);
        yAxis = new Rectangle(gizmosPos.x-10, gizmosPos.y-40, 20, 20);
    }
    
}
