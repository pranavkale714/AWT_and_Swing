package Awt_demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing_Mouse_Event_8 extends JFrame implements MouseListener, MouseMotionListener {
    JLabel msg;

    Swing_Mouse_Event_8() {
        msg = new JLabel("Move the mouse inside the window");
        msg.setHorizontalAlignment(JLabel.CENTER);
        msg.setFont(new Font("Arial", Font.BOLD, 14));

        add(msg, BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_Mouse_Event_8();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        msg.setText("Mouse Dragged at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        msg.setText("Mouse moved at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        msg.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        msg.setText("Mouse Pressed at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        msg.setText("Mouse Released at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        msg.setText("Mouse Entered at: " + e.getX() + "," + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        msg.setText("Mouse Exited at: " + e.getX() + "," + e.getY());
    }
}
