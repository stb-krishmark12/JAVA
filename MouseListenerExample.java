import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
    Label l;
    MouseListenerExample(){
        l=new Label();
    addMouseListener(this);
    l.setBounds(20,50,100,20);
    add(l);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
    }
public void mouseEntered(MouseEvent e){
l.setText("Mouse Entered");
}
public void mouseClicked(MouseEvent e){
    l.setText("Mouse Clicked");
}
public void mouseExited(MouseEvent e){
    l.setText("Mouse Exited");
}
public void mouseReleased(MouseEvent e){
    l.setText("Mouse Released");
}
public void mousePressed(MouseEvent e){
    l.setText("Mouse Pressed");
}
public static void main(String[] args){
    new MouseListenerExample();
}
}