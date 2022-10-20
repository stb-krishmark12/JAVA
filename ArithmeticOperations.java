import java.awt.GridLayout;
import javax.swing.*;


public class ArithmeticOperations extends JFrame {
    JLabel lblnum1,lblnum2,lblresult;
    JTextField txtnum1, txtnum2, txtresult;
    JButton btnadd, btnsub, btnmul,btndiv,btnmod,btncancel;
    int num1,num2,result;

    public ArithmeticOperations(){
        lblnum1 = new JLabel("Enter num1:");
        lblnum2 = new JLabel("Enter num2:");
        lblresult = new JLabel("Result");

        txtnum1 = new JTextField("0",10);
        txtnum2 = new JTextField("0",10);
        txtresult = new JTextField("0",10);
        txtresult.setEditable(false);

        btnadd=new JButton("+");
        btnsub=new JButton("-");
        btnmul=new JButton("*");
        btndiv=new JButton("/");
        btnmod=new JButton("%");
        btncancel=new JButton("cancel");

        setLayout(new GridLayout(6,2));

        add(lblnum1);
        add(txtnum1);
        add(lblnum2);
        add(txtnum2);
        add(btnadd);
        add(btnsub);
        add(btnmul);
        add(btndiv);
        add(btnmod);
        add(btncancel);
        add(lblresult);
        add(txtresult);


        btnadd.addActionListener(e->{
            num1 = Integer.parseInt(txtnum1.getText());
            num2 = Integer.parseInt(txtnum2.getText());
            result = num1 + num2;
            txtresult.setText(result+"");
        });


        btnsub.addActionListener(e->{
            num1 = Integer.parseInt(txtnum1.getText());
            num2 = Integer.parseInt(txtnum2.getText());
            result = num1 - num2;
            txtresult.setText(result+"");
        });

        btnmul.addActionListener(e->{
            num1 = Integer.parseInt(txtnum1.getText());
            num2 = Integer.parseInt(txtnum2.getText());
            result = num1 * num2;
            txtresult.setText(result+"");
        });

        btndiv.addActionListener(e->{
            num1 = Integer.parseInt(txtnum1.getText());
            num2 = Integer.parseInt(txtnum2.getText());
            result = num1/num2;
            txtresult.setText(result+"");
        });

        btnmod.addActionListener(e->{
            num1 = Integer.parseInt(txtnum1.getText());
            num2 = Integer.parseInt(txtnum2.getText());
            result = num1%num2;
            txtresult.setText(result+"");
        });

        btncancel.addActionListener(e-> System.exit(0));
        setSize(300,300);
        setVisible(true);
        setResizable(false);
  

    }
   public static void main(String[] args) {
    new ArithmeticOperations();
   }

    



    }

