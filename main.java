import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class main
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("GUI + a graphics JFrame");
      frame.setSize(1000,1000);
      frame.setLocation(20, 20);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new GUIPanel());
      frame.setVisible(true);
   }
}