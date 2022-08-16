//Que 9 
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
public class Frstring extends Frame{
    Frstring(){
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
}
void main(){
    Frstring b1=new Frstring();
    b1.setSize(new Dimension(400,400));
    Label l=new Label("hello i am Aryan");
    l.setBounds(25,50,250,30);
    l.setAlignment(Label.CENTER);
     b1.setBackground(Color.PINK);
     b1.add(l);
    b1.setTitle("demo");
    b1.setVisible(true);
    
}}