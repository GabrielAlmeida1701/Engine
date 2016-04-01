package Telas;

import Sys.Main;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MenusLaterais extends JPanel{
    
    Main main;
    Meio meio;
    ArrayList<File> Assents = new ArrayList<>();
    
    JScrollPane jp;
    
    public void corrige_Tam(){
        int larg = main.areaL().getWidth();
        jp.setPreferredSize(new Dimension(larg-10 ,(int) ((main.areaL().getHeight())*0.7f) ));
    }
    
    public void AddMoreButtons(){}
    
}
