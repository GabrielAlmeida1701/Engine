package Impl;

import Sys.Main;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class WindowListenerImpl implements ComponentListener {

    Main main;
    
    public WindowListenerImpl(Main main){
        this.main = main;
    }
    
    @Override
    public void componentResized(ComponentEvent e) {
        main.resized();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
        
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        
    }
    
}
