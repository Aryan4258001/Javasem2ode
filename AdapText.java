//Que 11 
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
class AdapText extends Frame{
    Label l;
    public AdapText(){
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    }
    void main(){
        AdapText b1=new AdapText();
        b1.setSize(new Dimension(400,400));
        b1.setTitle("Mick testing Mick testing check ckeck");
        b1.setVisible(true);
        l=new Label();
        l.setBounds(25,50,250,30);  l.setAlignment(Label.CENTER);
        addKeyListener(new MyKeyAdapter(l));
        b1.add(l);
    }}
class MyKeyAdapter extends KeyAdapter{
    Label l;
    public MyKeyAdapter(Label l){
        this.l=l;
    }
    void KeyTyped(KeyEvent e){
       l.setText("Typed character is : "+e.getKeyChar());
    }}