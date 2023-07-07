import javax.swing.*;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JavaSwingLearning implements ActionListener {
    JFrame frame;
    Dimension size;
    JButton button;
    Boolean change=false;
    JavaSwingLearning(){
        frame=new JFrame("This is my Project");
        frame.setLayout(null);

        button=new JButton("Click Me!!");
        button.setSize(100,50);
        button.setLocation(600,500);
        button.addActionListener(this);

        frame.add(button);

        size=new Dimension(Toolkit.getDefaultToolkit().getScreenSize());

        frame.setSize(size);
        frame.getContentPane().setBackground(Color.pink);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
      JavaSwingLearning obj=new JavaSwingLearning();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
         String e= actionEvent.getActionCommand();
         if(e.equals("Click Me!!") && change==false)
         {
             frame.getContentPane().setBackground(Color.black);
             change=true;
         }else {
             frame.getContentPane().setBackground(Color.pink);
             change=false;
         }
    }
}
