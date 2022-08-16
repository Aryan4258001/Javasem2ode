import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
public class QUE11{
    void main(){
        JFrame f1=new JFrame("Text Listener");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l=new JLabel("HiP_Hip_Hurray");
        f1.addKeyListener(new MyKeyAdapter(l));
        f1.add(l);
        f1.setVisible(true);
    }
}
class MyKeyAdapter extends KeyAdapter{
    JLabel l;
    public MyKeyAdapter(JLabel l){
        this.l=l;
    }
    void KeyTyped(KeyEvent e){
       l.setText("Typed character is : "+e.getKeyChar());
    }}