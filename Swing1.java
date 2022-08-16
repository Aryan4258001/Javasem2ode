import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class Swing1{
    Label l1;
    Swing1(){
        JFrame f1=new JFrame("A simple swing application");
        f1.setLayout(new FlowLayout());
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creating Button
        JButton b1=new JButton("Alpha");
        JButton b2=new JButton("Beta");
        //Adding listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l1.setText("Alpha is pressed");
            }});
             b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l1.setText("Beta is pressed");
            }});
             f1.add(b1);  
             f1.add(b2);  
            JLabel l1=new JLabel("click on button");
            f1.add(l1);  l1.setVisible(true);
        f1.setTitle("HI");

    }
}
