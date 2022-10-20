import java.io.*;
import java.awt.*;
import javax.swing.*;
public class Palindrome{
public static void main(String[] args){
JFrame jf1 = new JFrame("Swing frame");
jf1.setSize(900,300);
jf1.setLocation(400,451);
jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JPanel jp1=new JPanel();

JLabel l1=new JLabel("Enter String:");


JTextField t1=new JTextField(10);
t1.setText("");
JTextField t2=new JTextField(10);
t1.setText("");

JButton jb1= new JButton("Check");
jp1.add(l1);
jp1.add(t1);

jp1.add(jb1);
jf1.add(jp1);
jf1.show();
jb1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(e.getActionCommand().equals("Check")){
String s=t1.getText();
char ch[]=s.toCharArray();
int n=s.length;
String

for (int i =0; i<=n; i++)
{
add.concat(s.charAt(i));
}
if(add==s)
{
t2.setText("The Entered string is palindrome");
}
else 
t2.setText("The Entered string is not a palindrome");



