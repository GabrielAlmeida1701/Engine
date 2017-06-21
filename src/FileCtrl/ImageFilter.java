package FileCtrl;

import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;

public class ImageFilter extends FileFilter{
    
    private static ArrayList<String> types;//cria uma lista privada
        static{
            //cria uma lista temporaria
            ArrayList<String> tmp = new ArrayList<>();
            
            //adiciona os valores na nova lista
            tmp.add(".jpeg");
            tmp.add(".jpg");
            tmp.add(".png");
            tmp.add(".gif");
            
            //atribui a lista temporaria para a lista privada
            types = tmp;
        }
    
    @Override
    public boolean accept(File f) {
        if(f.isDirectory())
            return true;
        
        if(f != null){
            return formatAccept(f.getName());
        }
        
        return false;
    }
    
    public static boolean formatAccept(String name){
        int start = name.lastIndexOf(".");
        String ext = name.substring(start).toLowerCase();
        
        if(types.contains(ext))
            return true;
        
        return false;
    }
    
    public static String getTypes(File f){
        int start = f.getName().lastIndexOf(".");
        String ext = f.getName().substring(start).toLowerCase();
        
        return ext;
    }

    @Override
    public String getDescription() {
        return "Image Files Only";
    }
    
}
