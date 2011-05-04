/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import jjournal.FormatDataConnector;

/**
 *
 * @author bambucha
 */
public class ReadPanel extends JPanel {

    Rectangle r;
    JTextArea entryText;
    FormatDataConnector fdc;

    public ReadPanel(Rectangle rect, FormatDataConnector fdconn) {
        super();
        this.r = rect;
        this.fdc = fdconn;
        setBackground(Color.white);
        setBounds(r);
        
    }
}
