import javax.swing.*;
 public class JButtonEx{
    public static void main(String args[]){
        JFrame f= new JFrame("Button Example");
        JButton b= new JButton("Click");
         b.setBounds(130,100,100,40);
          f.add(b);
          f.setSize(400,400);
          f.setLayout(null);
          f.setVisible(true);
    }
 }