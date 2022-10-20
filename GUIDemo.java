import java.awt.*;
import javax.*;


















jb1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){

if (e.getActionCommand().equals("click me!!!")){
count++;
System.out.println("Button has been clicked for "+count+" time(s)");
}
}
});