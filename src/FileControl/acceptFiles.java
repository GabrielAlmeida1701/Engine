package FileControl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class acceptFiles {
    
    public static File doc = new File(System.getProperty("user.home") + File.separatorChar + "Documents");
    
    public static boolean canAdd(File f, ArrayList<File> fs){
        ArrayList<String> names = new ArrayList<>();
        for(File files: fs){
            names.add(files.getName());
        }
        
        return !names.contains(f.getName());
    }
    
    public static boolean canAdd(String format){
        return ImageFilter.formatAccept(format);
    }
    
    //checa quantos aquivos com o mesmo nome tem nessa pasta
    public static String quant(ArrayList<File> f, int i, File courent){
        int quant = 0;
        if(i > 0){
            List<File> fs = f.subList(0, i);
            for(int x=0; x < fs.size(); x++)
                if(  courent.getName().equals(fs.get(x).getName())  )
                    quant++;
        }
        if(quant == 0)
            return "";
        
        return " ("+quant+")";
    }
    
    //checa quantas pastas com o mesmo nome
    public static String quant(File files[], String nome){
        int quant = 0;
        String newNome;
        for (File file : files) {
            newNome = file.getName();
            if(nome.equals( newNome ))
                    quant++;
            
            try{
                int s = file.getName().lastIndexOf("(");
                int e = file.getName().lastIndexOf(")");
                if (s > 0){
                    String nomeF = file.getName().substring(0, s-1);
                    if(nomeF.equals(nome))
                        quant = Integer.parseInt(file.getName().substring(s+1, e))+1;
                }
            }catch(Exception e){
                return nome; 
            }
        }
        
        if(quant == 0)
            return nome;
        
        return  nome+" ("+quant+")";
    }
    
}
