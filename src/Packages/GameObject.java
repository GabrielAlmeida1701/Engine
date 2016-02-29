package Packages;

import Telas.Meio;
import java.io.File;

public class GameObject extends Transform{
    
    public boolean isPlayer;
    public boolean hasPath;
    public boolean isShopper;
    public boolean isAlly;
    public boolean isStatic;
    
    public GameObject(String nome, File me){
        super(nome, me);
        
    }
    
}
