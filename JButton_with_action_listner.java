import java.awt.event.*;
import javax.swing.*;
public class JButton_with_action_listner {
public static void main(String[] args) { 
	JFrame f=new JFrame("Button Example");
final JTextField tf=new JTextField();
tf.setBounds(50,50, 150,30);
JButton b=new JButton("Click Here"); 
	b.setBounds(50,100,120,30); 
b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
	tf.setText("Welcome to Java.");}   });
	f.add(b);  f.add(tf);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);}  }

