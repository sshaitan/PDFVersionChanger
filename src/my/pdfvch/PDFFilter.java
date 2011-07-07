/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.pdfvch;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author ssh
 */
public class PDFFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {

    if (pathname.getName().endsWith(".pdf")) return true;
    
    return false;
  }
    
}
