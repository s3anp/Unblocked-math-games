import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class bullet           
{
   //fields
   private int myX;
   private int myY;
   private int mydx;
   
   //constructor
   public bullet(int x, int y)
   {
      myX = x;
      myY = y;
      mydx = 3;
   }
   
   //move method
   public void move()
   {
      myX += mydx;
   }
   
   public int getX()
   {
      return myX;
   }
   
   public int getY()
   {
      return myY;
   }
   
   //check method
   public boolean removeELeft(int  oX, int oY) //if it hits player//takes in another x and y to see if its a hit//to check if left was hit, use the other for right
   {
      if(oX>myX && oX-20>myX)
      {
         if(oY>myY && oY-20<myY)
         {
            return true;
         }
         
         else
         {
            return false;
         }
      }
      
      else
      {
         return false;
      }
   }
   public boolean removeERight(int  oX, int oY) //if it hits player//takes in another x and y to see if its a hit//to check if left was hit, use the other for right
   {
      if(oX<myX && oX+20>myX)
      {
         if(oY>myY && oY-20<myY)
         {
            return true;
         }
         
         else
         {
            return false;
         }
      }
      
      else
      {
         return false;
      }
   }

   
   
   public boolean gone() //if its off screen
   {
      if(myX > 1000)
      {
         return true;
      }
      
      else
      {
         return false;
      }
   }
   
   //public boolean halfway() //if its about halfway through screen
   //{
      //if(myY > 300)
      //{
         //return true;
      //}
      
      //else
      //{
         //return false;
      //}
   //}
   
   //draw method
   public void draw(Graphics g)
   {
      Color color = new Color(232, 158, 60);
      g.setColor(color);
      g.fillRect(myX, myY, 10, 10);
   }
}