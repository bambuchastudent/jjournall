/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 *
 * @author bambucha
 */
public class FullScreenMainView extends JWindow {

    public FullScreenMainView() {
        super(new JFrame());
        JButton button = new JButton("Exit");

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ev) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        add(button);

        //get the screen size
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();

        //sets the location of the window to top left of screen
        setBounds(0, 0, screenSize.width, screenSize.height);
    }
}
