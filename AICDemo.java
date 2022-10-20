import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class AICDemo extends JPanel{
static int count;
public static void main(String[] args){
JFrame jf1= new JFrame();
jf1.add(new AICDemo());
jf1.setSize(400,400);
jf1.setVariable(true);
}
AICDemo(){
Jbutton jb1= new JButton("ok");
jb1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(e.getActionCommand().equals("ok")){
count++;
System.out.println("Button has been clicked for "+count+" time(s)");
}
}
});
add(jb1);
}
}