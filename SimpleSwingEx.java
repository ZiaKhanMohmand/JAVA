import javax.swing.*;

 class SimpleSwingEx{
 public static void main(String args[]){
     JFrame f= new JFrame();
     JButton b= new JButton("click");
      b.setBounds(130,100,100,40);
     f.add(b);
     f.setSize(400,300);
     f.setLayout(null);
     f.setVisible(true);
}
}