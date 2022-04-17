import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class GUIPanel extends JPanel
{
    //FIELDS
    //panel at the bottom
        //p1 actual score
   JTextField p1pts;
        //p2 actual score
   JTextField p2pts;
        //actual time
   JTextField time;
    
   Code codepanel;

    //constructor
   public GUIPanel()
   {
      setLayout(new BorderLayout());
      JPanel southside = new JPanel();
      southside.setLayout(new GridLayout(2, 3));
   
      JLabel p1score = new JLabel("P1 Score");
      p1score.setFont(new Font("Serif", Font.BOLD, 12));
      p1score.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(p1score);
   
      JLabel timer = new JLabel("Timer");
      timer.setFont(new Font("Serif", Font.BOLD, 12));
      timer.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(timer);
   
      JLabel p2score = new JLabel("P2 Score");
      p2score.setFont(new Font("Serif", Font.BOLD, 12));
      p2score.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(p2score);
   
      p1pts = new JTextField("20", 12);
      p1pts.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(p1pts);
   
      time = new JTextField("1.00", 12);
      time.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(time);
   
      p2pts = new JTextField("20", 12);
      p2pts.setHorizontalAlignment(SwingConstants.CENTER);
      southside.add(p2pts);
   
      add(southside, BorderLayout.SOUTH);
      //add(subpanel, BorderLayout.WEST);
      codepanel= new Code();
      add(codepanel);
      JButton button = new JButton("Reset with a new triangle!");
      button.addActionListener(new resetButton());
      add(button, BorderLayout.SOUTH);
        
   }
   private class resetButton implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         codepanel.reset();
         
         codepanel.requestFocusInWindow();
         
      }
   }

}