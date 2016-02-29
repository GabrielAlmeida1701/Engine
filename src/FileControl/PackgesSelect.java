package FileControl;

import static FileControl.acceptFiles.doc;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PackgesSelect {
    
    ArrayList<File> Assents = new ArrayList<>();
    File file, assents;
    File projeto;
    public static File assFolder;
    
    public PackgesSelect(){
        String i = System.getenv("ProgramFiles");
        file = new File(i+"//EngineTest");
        assents = new File(file.getPath()+"//Assents");
    }
    
    public void createFolder(String name){
        //cria pasta do projeto em meus documentos
        projeto = new File(doc.getPath()+"//EngineProjects//"+name);
        projeto.mkdir();
        
        //cria pasta dos Assents dentro da pasta do projeto
        assFolder = new File(projeto.getPath()+"//Assents");
        assFolder.mkdir();
    }
    
    public int getNumPacks(){
        return assents.listFiles().length;
    }
    
    public String getPacksNames(int i){
        File childs[] = assents.listFiles();
        int fim = childs[i].toString().lastIndexOf("\\");
        return childs[i].toString().substring(fim+1);
    }
    
    public void createWithThis(ArrayList<Boolean> objs, ArrayList<File> externals){
        //Procura arquivos do pacotes
        for(int i = 0; i<objs.size(); i++){
            if(objs.get(i)){
                File file[] = new File(assents.getPath()+"\\"+getPacksNames(i)).listFiles();
                for(File f: file){
                    if(acceptFiles.canAdd(f.getName()))
                        Assents.add(f);
                }
            }
        }
        
        externals.stream().forEach((external) -> {//For Each Chique
            Assents.add(external);
        });
        
        Assents.stream().forEach((copyFile) -> {
            copiaArq(copyFile, typeFile(copyFile));
        });
       
    }
    
    private File typeFile(File source){
        String path = source.getName();
        int fim = path.lastIndexOf(".");
        String nome = path.substring(0, fim);
        
        int lastIndex = Assents.indexOf(source)-1;
        nome = nome + acceptFiles.quant(Assents, lastIndex, source);
            
        File file = new File(assFolder.getPath()+"//"+nome+ImageFilter.getTypes(source));
        
        return file;
    }

    
    public void copiaArq(File f, File dest){
        CopyOption[] options = new CopyOption[]{StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES};
        try {
            Files.copy(f.toPath(), dest.toPath(), options);
        } catch (IOException ex) {
            Logger.getLogger(PackgesSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
