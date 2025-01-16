import javax.swing.*;

public class AggregationExample{
    Jframe f;
    AggregationExample(){
       f= new Jframe();
       JButton b= new JButton("Click");
        b.setBounds(130, 100, 100, 40);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }

 public static void main(String args[]){
    new AggregationExample();
 }}