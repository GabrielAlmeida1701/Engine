package ComponentsCtrl;

import ComponentsCtrl.Telas.CreateComponentWindow;
import FileCtrl.PackgesSelect;
import java.io.File;

public class CreateComponent {
    
    public File scriptFolder;
    
    public CreateComponent(){
        scriptFolder = new File(PackgesSelect.assFolder.getPath()+"\\Scripts\\");
        if(!scriptFolder.exists()) scriptFolder.mkdir();
        
        //new CreateComponentWindow(scriptFolder).setVisible(true);
    }
    
}
