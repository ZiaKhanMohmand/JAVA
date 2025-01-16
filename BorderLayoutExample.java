import java.awt.*;
import javax.swing.*;
 public class BorderLayoutExample {
    JFrame f;
    BorderLayoutExample (){
        f= new JFrame("BorderLayout example");
         JButton b1=new JButton("North");
         JButton b2=new JButton("South");
         JButton b3=new JButton("West");
         JButton b4=new JButton("East");
         JButton b5=new JButton("Center");
         f.setLayout(new BorderLayout(20,30));
          f.add(b1,BorderLayout.NORTH);
          f.add(b2,BorderLayout.SOUTH);
          f.add(b3,BorderLayout.WEST);
          f.add(b4,BorderLayout.EAST);
          f.add(b5,BorderLayout.CENTER);
          f.setSize(300,300);
          f.setVisible(true);
          
    }
    public static void main(String[] args){
      new BorderLayoutExample();
   }
 }