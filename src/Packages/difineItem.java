package Packages;

import java.io.File;

public class difineItem {
    
    static public GameObject newItem(File item, String nome){
        GameObject go = new GameObject(nome, item);
        
        return go;
    }
    
}
