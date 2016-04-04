package StatusCtrl;

import Packages.GameObject;
import Packages.difineItem;
import Sys.Main;
import Telas.Lado;
import Telas.Meio;
import java.awt.Component;
import java.io.File;
import javax.swing.*;

public class StatusFilePanel {
    
    private Lado lado;
    private File selectedGameObject;
    private Component[] UIElements = new Component[2];
    
    public StatusFilePanel(Lado lado){
        this.lado = lado;
    }
    
    public void UpdateUI(File f){
        selectedGameObject = f;
        
        ((JLabel)UIElements[0]).setText(f.getName());
        lado.statusPanel.updateUI();
    }
    
    public void AddGameObjectToScene(Main main, Meio meio){
        GameObject go = difineItem.newItem(selectedGameObject, selectedGameObject.getName());
        meio.screen.elementos.add( go );
        meio.screen.selectElm = go;
        main.setTransformValues(go.position.x, go.position.y,
                                go.scale.width, go.scale.height);
    }
    
    public Component[] CreateUIElements(){
        UIElements[0] = new JLabel("Selecione um Objeto");
        UIElements[1] = new JButton("Objeto");
        
        return UIElements;
    }
    
}
