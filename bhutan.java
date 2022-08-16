//Que 10
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class bhutan extends Frame{
    bhutan(){
         addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });  } 
    public void main(){
        Button RED=new Button("RED");
        Button BLUE=new Button("BLUE");
        bhutan b1=new bhutan();
        b1.setSize(new Dimension(400,400));
        b1.add(RED,BorderLayout.NORTH);
        b1.add(BLUE,BorderLayout.SOUTH);
        b1.setVisible(true);
        RED.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                b1.setBackground(Color.RED);
            }
        });
        BLUE.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                b1.setBackground(Color.BLUE);
            }
        });
 }}