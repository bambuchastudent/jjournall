/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import jjournal.FormatData;
import jjournal.FormatDataConnector;

/**
 *
 * @author bambucha
 */
public class ReadPanel extends JTextArea {

    Rectangle r;
    FormatDataConnector fdc;
    FormatData fdata;

    public ReadPanel(Rectangle rect, FormatDataConnector fdconn) {
        super();
        this.r = rect;
        this.fdc = fdconn;
        setBackground(Color.white);
        setBounds(r);
        this.fdata = fdc.getFormatData();
        String pageData[][] = fdata.getFormattedText();
        String pageText[] = new String[pageData.length];
        
        for (int i = 0; i < pageData.length; i++) {
            pageText[i] = fdata.formatDataAddress + "\n";
            System.out.print("\ncount i:"+i+" pageText "+pageText.length);
            for (int j = 0; j < pageData[i].length; j++) {
                System.out.print("\ncount j:"+i+" pageData "+pageData.length+" pageData.i "+ pageData[i].length);
                pageText[i] += pageData[i][j];
                System.out.println(pageText[i]);
            }
        }
        setText(pageText[0]);
    }
}
