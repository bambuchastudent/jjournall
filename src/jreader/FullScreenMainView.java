/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;
import jjournal.Main.Controller;

/**
 *
 * @author bambucha
 */
public class FullScreenMainView extends JWindow {

    final Controller viewController;

    public FullScreenMainView(Controller controller) {
        super(new JFrame());
        this.setName("FullScreen");
        this.viewController = controller;
        JButton exitButton = new JButton("Exit");
        JButton returnButton = new JButton("Go to main menu");
        returnButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ev) {
                setVisible(false);
                viewController.showView("Main");
            }
        });
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ev) {
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        add(exitButton);
        add(returnButton);

        //get the screen size
        Dimension screenSize =
                Toolkit.getDefaultToolkit().getScreenSize();

        //sets the location of the window to top left of screen
        setBounds(0, 0, screenSize.width, screenSize.height);

        viewController.registerView(getName(), this);
    }
}
