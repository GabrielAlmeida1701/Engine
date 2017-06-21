package Telas;

import Packages.GameObject;
import Packages.difineItem;
import StatusCtrl.StatusFilePanel;
import Sys.Main;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lado extends MenusLaterais{
    
    JPanel panel = new JPanel();
    JTabbedPane guiasFiles = new JTabbedPane();
    public JPanel statusPanel = new JPanel();
    StatusFilePanel sfp;
    
    public Lado(Main main, Meio meio, ArrayList<File> assents){
        this.main = main;
        this.meio = meio;
        this.Assents = assents;
        
        int larg = main.areaL().getWidth();
        
        //Limpa o painel
        panel.removeAll();
        
        sfp = new StatusFilePanel(this);
        
        //Coloca os Botoes
        for(int i=0; i<Assents.size(); i++){
            JButton bt = null;
            final File f = Assents.get(i);
            
            Icon icone = new ImageIcon(f.getPath());
            bt = new JButton(icone);
            
            bt.setPreferredSize(new Dimension(70, 70));
            panel.add(bt);
            
            bt.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    addGameObject(f);
                    /*Thread gocs = new Thread
                        (new GameObjectConfigurationScreen(f));
                    gocs.start();*/
                }
            });
        }
        new ComponentsCtrl.CreateComponent();
        panel.setPreferredSize(new Dimension(larg-100, ( (Assents.size()/4)+10 )*70 ));//Define o tamanho do painel
        guiasFiles.setPreferredSize(panel.getPreferredSize());
        guiasFiles.addTab("Images", panel);
        
        jp = new JScrollPane(panel);//Declara JScrollPane
        jp.setPreferredSize(new Dimension(larg-10, (int) ((main.areaL().getHeight())*0.7f) ));//Atribui o tamanho da arealado a jp
        jp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//garante q a barra de rolagem apareça
        
        add(jp);
        
        JSlider size = new JSlider(JSlider.HORIZONTAL, 25, 150, 70);
        size.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e) {
                atualizaLado(size.getValue());
            }
        });
        add(size);
        
        statusPanel.setPreferredSize(new Dimension(larg, main.getHeight()/4));
        statusPanel.setBackground(Color.GRAY);
        
        for(int i=0; i<sfp.CreateUIElements().length; i++)
            statusPanel.add(sfp.CreateUIElements()[i]);
        
        //add(statusPanel);
    }
    
    private void atualizaLado(int valor){
        for(int i=0; i<panel.getComponents().length; i++){
            Component bnt = panel.getComponents()[i];
            if(bnt instanceof JButton){
                if(valor > 30){
                    ((JButton)bnt).setPreferredSize(new Dimension(valor, valor));
                }else{
                    ((JButton)bnt).setPreferredSize(new Dimension(valor*5, valor));
                }
            }
        }
        
        panel.updateUI();
    }
    
    @Override
    public void AddMoreButtons(ArrayList<File> Assents){
        panel.removeAll();
        
        for(int i=0; i<Assents.size(); i++){
            JButton bt = null;
            final File f = Assents.get(i);
            
            Icon icone = new ImageIcon(f.getPath());
            bt = new JButton(icone);
            
            bt.setPreferredSize(new Dimension(70, 70));
            panel.add(bt);
            
            bt.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    addGameObject(f);
                }
            });
        }
        
        panel.updateUI();
    }
    
    private void addGameObject(File f){
        GameObject go = difineItem.newItem(f, f.getName());
        meio.screen.elementos.add( go );
        meio.screen.selectElm = go;
        main.setTransformValues(go.position.x, go.position.y,
                go.scale.width, go.scale.height);
    }
    
    @Override
    public void resize(){
        statusPanel.setPreferredSize(new Dimension(main.areaL().getWidth(), main.getHeight()/4));
        panel.updateUI();
    }
    
    @Override
    public void addTab(){
        System.out.println(guiasFiles.getTabCount());
        if(guiasFiles.getTabCount() == 0)
            guiasFiles.addTab("Componentes", panel);
    }
}
