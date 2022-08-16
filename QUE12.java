//QUE 12 swings
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class QUE12{
     String name="Aryan ",course=" BSc (H) C.S ",college=" sscbs";
    int roll=15,CGPA=10;
    void main(){
        JFrame f1=new JFrame("A String with pink background");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel p1=new JPanel();
                JButton b1=new JButton("A"); p1.add(b1);
                JButton b2=new JButton("B");  p1.add(b2);
                f1.add(p1);
                p1.setAlignmentX(Component.CENTER_ALIGNMENT);
                JLabel l1=new JLabel(); 
                f1.add(l1);
                b1.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
              l1.setText(" Name - "+name+"Course :"+course+"College "+college+" Roll no: "+roll);
            }
        });
              b2.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                l1.setText("CGPA is : "+CGPA);
            }
        });
        f1.setVisible(true);
    }
}