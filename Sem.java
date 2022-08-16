 //Que 12
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
class Sem extends Frame{
    String name="Aryan ",course=" BSc (H) C.S ",college=" sscbs";
    int roll=15,CGPA=10;
    Sem(){
         addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });  
    }
    void main()throws IOException{
         Button A=new Button("A");
         Button B=new Button("B");
        Sem b1=new Sem();
        b1.setSize(new Dimension(400,400));
        b1.add(A,BorderLayout.NORTH);
        b1.add(B,BorderLayout.SOUTH);
        b1.setVisible(true);
         Label l=new Label(""); 
         l.setBounds(25,50,250,30);  
         l.setAlignment(Label.CENTER);
         b1.add(l);
        A.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
              l.setText(" Name - "+name+"Course :"+course+"College "+college+" Roll no: "+roll);
            }
        });
        B.addActionListener(new ActionListener()
        {  public void actionPerformed(ActionEvent e){
                l.setText("CGPA is : "+CGPA);
            }
        });
    }
}