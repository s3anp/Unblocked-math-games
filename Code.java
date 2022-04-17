import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.Arrays;

class Code extends JPanel
{
    //FIELDS
    //background/graphics
   public static final int FRAME = 1000;
   private static final Color BACKGROUND = Color.BLACK;
   
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Timer refresh;
   private Timer timer;


    //players
   leftsprite left;
   rightsprite right;
    //meteor
    //speed
    //sabotage
    //healing
    
    
    


   public Code()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0,0,FRAME,FRAME);
      left = new leftsprite();
      right = new rightsprite();
        //stars = new SpaceTheme();
      addKeyListener(new Key());
      setFocusable(true);
   
      refresh = new Timer(5, new AnimationListener());
      refresh.start();
   }

    
   public void paintComponent(Graphics g)  //Required method to paint to the screen
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);  
   }
    
   
   
   public void reset()
   {
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0,0,FRAME,FRAME);
      left.drawing(myBuffer);
      repaint();
      
   }
   public void animate()
   {
      //Start over with a blank background
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0,0,1000,1000);
      left.move();
      left.drawing(myBuffer);
      right.move();
      right.drawing(myBuffer);
      // if(shooting)
   //       {
   //          rocket.move();
   //          rocket.draw(myBuffer);
   //       }
   //       if(twoRockets && shooting2)
   //       {
   //          rocket2.move();
   //          if(rocket2.getMyY()<tri.getY())
   //          {
   //          
   //             rocket2.draw(myBuffer);
   //             System.out.print(rocket2.getMyY()+" ");
   //             System.out.println(rocket.getMyY());
   //          }
   //       }
      // if(borg.getX()==10)
   //       {
   //          direction=true;
   //       }
   //    
   //       if(borg.getX()==300)
   //       {
   //          direction=false;
   //       }
   //       
   //       if(borg.hit(rocket.getMyX(),rocket.getMyY())||borg.hit(rocket2.getMyX(),rocket2.getMyY()))
   //       {
   //          amHit=true;
   //       }
   //       if(!RocketHit)
   //       {
   //          Power2.drawing(myBuffer);
   //       }
   //       if(!amHit)
   //       {
   //          if(direction)
   //          {
   //             borg.moveRight();
   //             borg.drawing(myBuffer);
   //          }
   //          else
   //          {
   //             borg.moveLeft();
   //             borg.drawing(myBuffer);
   //          }
   //       }
      // if(!SpeedHit)
   //       {
   //       
   //          Power1.drawing(myBuffer);
   //       }
   //       if(changeRocket)
   //       {
   //          rocket2.adddy(-4);
   //       }
      //Call paintComponent
      repaint();
   }

   private class Key extends KeyAdapter  //This subpanel must have focus for keyboard input to register (see above)
   {
      public void keyPressed(KeyEvent e)  //We override this method; "e" contains a lot of information...
      {
      	//...including a Key Code, which will let us see which key the user pressed.  Check for 'r':
                  //rocket firing is broke
         //no matter what key was pressed, update and repaint
         if(e.getKeyCode() == KeyEvent.VK_W){
            left.adddy(2);
            
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_S){
            left.adddy(2);
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_UP){
            right.adddy(2);
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_DOWN){
            right.adddy(2);
            
            
         }
         
         myBuffer.setColor(BACKGROUND);
         myBuffer.fillRect(0,0,FRAME,FRAME);
         left.drawing(myBuffer);
         right.drawing(myBuffer);
         repaint();
         
      }
      public void keyReleased(KeyEvent e)  //Note keyReleased is called when... a key is released!
      {
      	// check for up arrow
         if(e.getKeyCode() == KeyEvent.VK_W){
            left.adddy(-2);
            
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_S){
            left.adddy(-2);
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_UP){
            right.adddy(-2);
            
            
         }
         if(e.getKeyCode() == KeyEvent.VK_DOWN){
            right.adddy(-2);
            
            
         }
         
            
      }
      
   
   }
   private class AnimationListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)  //Gets called over and over by the Timer
      {
         animate();  //...hence animation!
      }
   }
   
}