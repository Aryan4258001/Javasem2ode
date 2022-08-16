//Que 9 swings
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class QUE9 extends JFrame{
    void main(){
        JFrame f1=new JFrame("A String with pink background");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("Bonjour! its Aryan ",JLabel.CENTER);
            f1.add(l1);
            f1.getContentPane().setBackground(Color.PINK);
            f1.setVisible(true);
    }
}