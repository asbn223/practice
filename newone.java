import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

class newone
{
    JFrame frame;
    Container container;

    public static void main(String[] args) {
        newone n = new newone();
        n.runMyapp();
    }
    void runMyapp()
    {
        newFrame();
        newContainer();
        newLabel();
        newMenu();
        //myJOptionPane();
    }   

    void newFrame()
    {
        frame = new JFrame("New");
        frame.setVisible(true);
        
        frame.setLayout(null);
        frame.setBackground(Color.BLUE);

        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Free Wifi");
    }
    
    void newContainer()
    {
        container = frame.getContentPane();

    }

    void newLabel()
    {
        JLabel label = new JLabel("This is new window");
        label.setText("Free Wifi Forever");

        container.add(label);
        frame.add(label);

    }

    //MenuBar haru ko lagi ho
    void newMenu()
    {
        JMenu menu, submenu;
        JMenuItem i1, i2, i3, i4, i5;

        JMenuBar mb = new JMenuBar();

        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");

        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        submenu.add(i4);
        submenu.add(i5);

        menu.add(submenu);
        mb.add(menu);

        frame.setJMenuBar(mb);
        
        

    }
    
    // void myJOptionPane() {
    //     JOptionPane.showMessageDialog(frame, "Hello, This is JOptionPane.");
    //     JOptionPane.showMessageDialog(frame, " Successfully Updated.", " Alert", JOptionPane.WARNING_MESSAGE);
    //     String name = JOptionPane.showInputDialog(frame, "Enter Name");

    //     // For this need window listener
    //     // int a = JOptionPane.showConfirmDialog(jFrame, "Are you sure?");
    //     // if (a == JOptionPane.YES_OPTION) {
    //     // jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     // }
    // }

}