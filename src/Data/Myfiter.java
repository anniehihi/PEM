/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.File;
import javax.swing.filechooser.*;
public class Myfiter extends FileFilter{
    
    private String name;
    private String exe;

    public Myfiter() {
    }

    public Myfiter(String name, String exe) {
        this.name = name;
        this.exe = exe;
    }
    

    @Override
    public boolean accept(File f) {
      if(f.isDirectory()){
          return true;
      }
      
      return f.getName().endsWith(this.exe);
    }

    @Override
    public String getDescription() {
        return this.name + " (." + this.exe + " )";
    }
    
}
