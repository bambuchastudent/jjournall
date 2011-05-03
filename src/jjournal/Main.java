/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jjournal;

import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import jreader.FullScreenMainView;

/**
 *
 * @author bambucha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static FullScreenMainView fsmw;
    public static void main(String[] args) {
       JFrame letsBegin = new JFrame("JJournal");
       letsBegin.setBounds(new Rectangle(10, 10, 500, 300));
       letsBegin.setVisible(true);
       letsBegin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       letsBegin.setLayout(new FlowLayout());
       JButton fullScreenButton = new JButton("Start Reader (Fullscreen)");
       fullScreenButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                fsmw = new jreader.FullScreenMainView();
                fsmw.setVisible(true);
            }
        });
       letsBegin.add(fullScreenButton);
    }
}
