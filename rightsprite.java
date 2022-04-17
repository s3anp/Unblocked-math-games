import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class rightsprite
{
    private Color c;
    private int x;
    private int y;
    private int width;
    private int height;
    
    private int dy;
    public rightsprite()
    {
        x = 980;
        y = 500;
        width = 20;
        height = 20;
        c = new Color(((int)Math.random() * (250 - 180) + 180), ((int)Math.random() * (250 - 180) + 180), ((int)Math.random() * (250 - 180) + 180));
    }
    public void drawing(Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y, width,height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);

    }
    public boolean isHit(int xIn, int yIn)
    {
        if(xIn>x && yIn>y && xIn<x+width && yIn<y+height)
        {
            return true;
        }
        return false;
    }
    public int getX()
    {

        return x;
    }
    public int getY()
    {
        return y;
    }
    public void move()
    {
        if(y<1000)
        {
            y+=dy;
        }
        else
        {
            y-=dy;
        }
    }
    public void adddy(int add)
    {
        dy+=add;
    }
}
