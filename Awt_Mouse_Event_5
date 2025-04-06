package Awt_demo;

import java.awt.*;
import java.awt.event.*;

public class Awt_Mouse_Event_5 extends Frame implements MouseListener, MouseMotionListener {
    Label msg;

    public Awt_Mouse_Event_5() {
        msg = new Label();
        msg.setBounds(50, 100, 200, 30);
        add(msg);

        addMouseListener(this);
        addMouseMotionListener(this);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
    	Awt_Mouse_Event_5 m =  new Awt_Mouse_Event_5();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        msg.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        msg.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        msg.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        msg.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        msg.setText("Mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        msg.setText("Mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        msg.setText("Mouse moved");
    }
}
