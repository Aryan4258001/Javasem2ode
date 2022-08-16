import javax.swing.*;
import  java.awt.*;
public class Prog9swing {


public static void main(String[] args) {
      Prg f = new Prg();
f.setVisible(true);
f.getContentPane().setBackground(Color.pink);
f.setSize(400, 400);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }

}



class Prg extends JFrame
 {Prg()
 {
setLayout(new FlowLayout());
JLabel lbl = new JLabel("This is my First Frame.", JLabel.CENTER);
add(lbl);  

 }      
 }


