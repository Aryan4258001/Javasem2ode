//Que10 swings
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class QUE10 extends JFrame{
    void main(){
        JFrame f1=new JFrame("A String with pink background");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton RED=new JButton("RED");
                JButton BLUE=new JButton("BLUE");
                JPanel p1=new JPanel(); p1.add(RED); p1.add(BLUE);
                f1.add(p1);
                p1.setAlignmentX(Component.CENTER_ALIGNMENT);
                RED.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                f1.getContentPane().setBackground(Color.RED);
            }
        });
        BLUE.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                f1.getContentPane().setBackground(Color.BLUE);
            }
        });
        f1.setVisible(true);
                        
    }
}