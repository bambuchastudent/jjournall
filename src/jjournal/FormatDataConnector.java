/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jjournal;

/**
 *
 * @author bambucha
 */
public class FormatDataConnector {

    String pages[][];
    FormatData fdata;
    public FormatDataConnector(String dbEntry) {
        fdata = new FormatData(dbEntry);
    }

    public FormatData getFormatData(){
        return fdata;
    }
}
