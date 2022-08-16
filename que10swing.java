import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class que10swing extends JFrame implements ActionListener
 {//JFramefrm = new JFrame("Buttons");
JButton bb = new JButton("Red");
JButton rb = new JButton("Blue");
que10swing()
 { 
     addWindowListener(new WindowAdapter(){
         void closeOperation(WindowEvent e){
             System.exit(0);
         }
     });
     
setLayout(null);
setSize(400, 400);
setVisible(true);
    //addWindowListener(new MyWindowAdapter());
rb.setBounds(50, 100, 80, 30);
bb.setBounds(150, 100, 80, 30);
rb.addActionListener(this);
bb.addActionListener(this);
add(rb);
add(bb);

 }

public void  actionPerformed(ActionEvent e)
      {

          System.out.println("hi its me \n dil pardesi ho gaya \n ");
          
if (e.getSource()==bb)
getContentPane().setBackground(Color.red);
if (e.getSource()==rb)
getContentPane().setBackground(Color.blue);


    }
}
