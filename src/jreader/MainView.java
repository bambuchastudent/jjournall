/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import jjournal.Main.Controller;

/**
 *
 * @author bambucha
 */
public class MainView extends JFrame {

    final Controller viewController;

    public MainView(Controller controller) {
        super();
        this.viewController = controller;

        setTitle("Main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());
        JButton button = new JButton("Show FullScreen");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                viewController.showView("FullScreen");
            }
        });
        getContentPane().add(button, BorderLayout.SOUTH);
        pack();
        setSize(200, 200);
        viewController.registerView(getTitle(), this);
    }
}
