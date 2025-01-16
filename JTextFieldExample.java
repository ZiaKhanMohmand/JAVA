import javax.swing.*;
 public class JTextFieldExample{
    public static void main (String[] args){
        JFrame f=new JFrame("JTextField Example");
        JTextField t1=new JTextField();
        t1.setBounds(50, 50, 100,30);
        t1.setText("First JTextField");
        JTextField t2=new JTextField("Second JTextField");
        t2.setBounds(50, 100,100,30);
        f.add(t1); f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
 }