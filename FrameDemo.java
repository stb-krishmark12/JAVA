import java.awt.*;
import javax.swing.*;
public class FrameDemo{
public static void main(String[] args){
JFrame jf1 = new JFrame("Swing frame");
jf1.setSize(300,300);
jf1.setLocation(400,451);
jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JPanel jp1=new JPanel();

JLabel jl1=new JLabel("Enter word");


JTextField jt1=new JTextField();
JTextField jt2=new JTextField();

JButton jb1= new JButton("Check");



jp1.add(jl1);
jp1.add(jt1);
jp1.add(jb1);

jf1.add(jp



jf1.show();

}
}