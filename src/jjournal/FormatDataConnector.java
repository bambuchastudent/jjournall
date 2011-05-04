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

    public FormatDataConnector() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                pages[i][j] = "Hello! From\n" + j;
            }
        }
    }

    public String[][] getFormattedText() {
        return this.pages;
    }
    public String[] getFormattedPage(int page){
        return this.pages[page];
    }
}
