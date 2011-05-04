/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jjournal;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;
import jreader.FullScreenMainView;
import jreader.MainView;

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
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Controller viewController = new Controller();
                MainView main = new MainView(viewController);
                FullScreenMainView detail = new FullScreenMainView(viewController);
                viewController.showView("Main");
            }
        });
    }

    public static class Controller {

        HashMap<String, JFrame> views;
        HashMap<String, JWindow> fsViews;

        public Controller() {
            views = new HashMap<String, JFrame>();
            fsViews = new HashMap<String, JWindow>();
        }

        public void registerView(String name, JFrame view) {
            views.put(name, view);
        }

        public void showView(String name) {
            if (views.containsKey(name)) {
                for (String key : views.keySet()) {
                    views.get(key).setVisible(key.equals(name));
                }
            } else if (fsViews.containsKey(name)) {
                for (String key : fsViews.keySet()) {
                    fsViews.get(key).setVisible(key.equals(name));
                }
            }
        }

        public void registerView(String name, FullScreenMainView view) {
            fsViews.put(name, view);
        }
    }
}
