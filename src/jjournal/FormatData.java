/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jjournal;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 *
 * @author bambucha
 */
public class FormatData implements Document{

    @Override
    public int getLength() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addDocumentListener(DocumentListener dl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeDocumentListener(DocumentListener dl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addUndoableEditListener(UndoableEditListener ul) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeUndoableEditListener(UndoableEditListener ul) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getProperty(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void putProperty(Object o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(int i, int i1) throws BadLocationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getText(int i, int i1) throws BadLocationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getText(int i, int i1, Segment sgmnt) throws BadLocationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position getStartPosition() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position getEndPosition() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position createPosition(int i) throws BadLocationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Element[] getRootElements() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Element getDefaultRootElement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void render(Runnable r) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
