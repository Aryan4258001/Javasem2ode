import java.awt.*;
import java.awt.event.*;
class A extends Frame implements ActionListener{
    Frame f=new Frame("test");
    Button b=new Button("Click");
    TextField t=new TextField(20);
    A(){
        f.add(b);
        f.add(t);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str=ae.getActionCommand();
        t.setText(str);
    }
}
class Hi{
    public static void main(String args[]){
        A ae=new A();
    }
}