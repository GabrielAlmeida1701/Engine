package Telas;

import Packages.GameObject;
import Packages.difineItem;
import Sys.Main;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

public class Lado extends MenusLaterais{
    
    public Lado(Main main, Meio meio, ArrayList<File> assents){
        this.main = main;
        this.meio = meio;
        this.Assents = assents;
        
        int larg = main.areaL().getWidth();
        
        JPanel panel = new JPanel();
        
        //Coloca os Botoes
        for(int i=0; i<Assents.size(); i++){
            JButton bt = null;
            final File f = Assents.get(i);
            
            bt = new JButton(Assents.get(i).getName());
            
            bt.setPreferredSize(new Dimension(70, 70));
            panel.add(bt);
            
            bt.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    GameObject go = difineItem.newItem(f, f.getName());
                    meio.screen.elementos.add( go );
                    meio.screen.selectElm = go;
                    main.setTransformValues(go.position.x, go.position.y,
                                    go.scale.width, go.scale.height);
                }
            });
        }
        
        panel.setPreferredSize(new Dimension(larg-100, ( (Assents.size()/4)+10 )*70 ));//Define o tamanho do painel
        
        jp = new JScrollPane(panel);//Declara JScrollPane
        jp.setPreferredSize(new Dimension(larg-10, (int) ((main.areaL().getHeight())*0.7f) ));//Atribui o tamanho da arealado a jp
        jp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//garante q a barra de rolagem apareça
        
        add(jp);
    }
}
