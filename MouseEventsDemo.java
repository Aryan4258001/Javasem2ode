import java.awt.event.*;
import java.awt.*;
/*
<applet code="MouseEvents" width=300 height=100>
</applet>
*/
public class MouseEventsDemo extends Frame
implements MouseListener, MouseMotionListener {
String msg = "";
int mouseX = 0, mouseY = 0; // coordinates of mouse
public MouseEventsDemo() {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}
// Handle mouse clicked.
public void mouseClicked(MouseEvent me) {
// save coordinates
mouseX = 0;
mouseY = 10;
msg = msg+ "   Mouse clicked.";
repaint();
}
// Handle mouse entered.
public void mouseEntered(MouseEvent me) {
// save coordinates
mouseX = 100;
mouseY = 100;
msg = "Mouse entered.";
repaint();
}
// Handle mouse exited.
public void mouseExited(MouseEvent me) {
// save coordinates
mouseX = 100;
mouseY = 100;
msg = "Mouse exited.";
repaint();
}
// Handle button pressed.
public void mousePressed(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "Down";
repaint();
}
// Handle button released.
public void mouseReleased(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "Up";
repaint();
}
// Handle mouse dragged.
public void mouseDragged(MouseEvent me) {
// save coordinates
mouseX = me.getX();
mouseY = me.getY();
msg = "*"+"Dragging mouse at " + mouseX + ", " + mouseY;
repaint();
}
// Handle mouse moved.
public void mouseMoved(MouseEvent me) {
// show status
msg="Moving mouse at " + me.getX() + ", " + me.getY();
}
// Display msg in applet window at current X,Y location.
public void paint(Graphics g) {
g.drawString(msg, mouseX, mouseY);
}
public static void main(String args[]){
    MouseEventsDemo b1=new MouseEventsDemo();
    b1.setSize(new Dimension(300,300));
    b1.setTitle("Demo");
    b1.setVisible(true);
}}
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
    System.exit(0);
    }}



