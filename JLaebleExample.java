import javax.swing.*;
 public class JLaebleExample{
    public static void main(String[] args){
        JFrame f=new JFrame("JLabel Example");
        JLabel fl=new JLabel();
        fl.setBounds(50,50,100,30);
        fl.setText("first Label");
        JLabel sl=new JLabel("Second Label");
        sl.setBounds(50, 100, 100, 30);
        f.add(fl); f.add(sl);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
 }