package Tools;

import Sys.Main;
import java.awt.Graphics;
import java.awt.Point;

public class drag extends tool{
    
    @Override
    public void useTool(Point e, Main main) {
        if(select != null){
            int x = e.x-select.scale.width/2;
            int y = e.y-select.scale.height/2;
            
            select.changeVals(x, "PX");
            select.changeVals(y, "PY");
            
            main.setTransformValues(select.position.x, select.position.y,
                                    select.scale.width, select.scale.height);
        }
    }

    @Override
    public void draw(Graphics g) {}

    @Override
    public void frstClick(Point e) {}
    
    
}
