/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pdfvch;

/**
 *
 * @author ssh
 */
import java.io.File;
import java.io.FileFilter;

public class FlattenFilter implements FileFilter {
      @Override
    public boolean accept(File pathname) {

    if (pathname.getName().endsWith(".flatten")) return true;
    
    return false;
  }
    
}
