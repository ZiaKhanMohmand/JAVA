import java.awt.event.*;
import javax.swing.*;
 public class ActionListenerExample{
    public static void main(String args[]){
        JFrame f=new JFrame("Button with action listener example");
      final  JTextField tf=new JTextField();
       tf.setBounds(50, 50,150,30);
       JButton b=new JButton("Click me");
       b.setBounds(50, 100, 100, 30);
       b.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(ActionEvent e){
            tf.setText("Welcome to Javatpoint");
        }
          
       });
       f.add(b); f.add(tf);
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
    }
 }