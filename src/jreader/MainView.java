/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jreader;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import jjournal.FormatData;
import jjournal.FormatDataConnector;
import jjournal.Main.Controller;

/**
 *
 * @author bambucha
 */
public class MainView extends JFrame {

    final Controller viewController;
    JTextField dbEntryAddressField;
    ReadPanel readPanel;
    FormatDataConnector fdc;

    public MainView(Controller controller) {
        super();
        this.viewController = controller;
        this.dbEntryAddressField = new JTextField("Default");
        dbEntryAddressField.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                newFDC();
            }
        });

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
        getContentPane().add(dbEntryAddressField, BorderLayout.NORTH);
        readPanel = new ReadPanel(new Rectangle(560, 260),
                new FormatDataConnector(dbEntryAddressField.getText()));
        System.out.println(dbEntryAddressField.getText());
        getContentPane().add(readPanel);
        pack();
        setSize(600, 300);
        viewController.registerView(getTitle(), this);

    }

    public String getDBAddress() {
        return dbEntryAddressField.getText();
    }

    public void newFDC() {
        this.fdc = new FormatDataConnector("Default");
    }
}
