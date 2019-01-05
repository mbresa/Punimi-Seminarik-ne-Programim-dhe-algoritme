import javax.swing.*;
import java.awt.*;

class PointGraphWriter extends JPanel

{private int x_pos;
   private int y_pos;
   private int axis_length;
   private String x_label="";
   private String y_label="";
   private int height;
   private int width=800;
   private int x1,y1;
   private int x2,y2;
   private int x3,y3;
   private int x4,y4;
   private int x5,y5;
   private int x6,y6; 
   
   public PointGraphWriter()
   {
      JFrame obj=new JFrame();
      obj.getContentPane().add(this);  
      obj.setSize(width,width);
      obj.setTitle("Graph");
      obj.setVisible(true);
   }
   
   public void paintComponent(Graphics g)
   {
   
   //drawing axes
   
      g.drawLine(x_pos,y_pos, x_pos + axis_length, y_pos);
      g.drawLine(x_pos,y_pos, x_pos, y_pos - axis_length);
      g.drawString(y_label,x_pos-20,y_pos-axis_length);
      g.drawString(x_label,x_pos+axis_length,y_pos+20);
      g.drawString("0",x_pos-15,y_pos);
      g.drawString("0",x_pos,y_pos+15);
   
      g.fillOval(x1, y1, 4 ,4 );
      g.fillOval(x2, y2, 4 ,4 );
      g.fillOval(x3, y3, 4 ,4 );
      g.fillOval(x4, y4, 4 ,4 );
      g.fillOval(x5, y5, 4 ,4 );
      g.fillOval(x6, y6, 4 ,4 );
    
      g.drawLine(x1+2, y1+2, x2+2, y2+2);
      g.drawLine(x2+2, y2+2, x3+2, y3+2);
      g.drawLine(x3+2, y3+2, x4+2, y4+2);
      g.drawLine(x4+2, y4+2, x5+2, y5+2);
      g.drawLine(x5+2, y5+2, x6+2, y6+2);
      repaint();   
   
   }

   public void setAxes(int x_pos,int y_pos,int axis_length,String x_label,String y_label)
   {     
      this.x_pos=x_pos;
      this.axis_length=axis_length;
      this.y_pos=y_pos+axis_length;
      this.y_label=y_label;
      this.x_label=x_label;
   
   }
public void setPoint1(int height)
   {
      y1 = y_pos-height-2;
      x1 =x_pos-2;
      repaint();
   
   }
   
   public void setPoint2(int height)
   {
      y2=y_pos-height-2;
      x2=(x_pos + axis_length / 5-2);
      repaint();
   }
  
   public void setPoint3(int height)
   {
      y3=y_pos-height-2;
      x3=(x_pos + (axis_length / 5)*2-2);
      repaint();
   } 
   
   public void setPoint4(int height)
   {
      y4=y_pos-height-2;
      x4=(x_pos + (axis_length / 5)*3-2);
      repaint();   }  
 
   public void setPoint5(int height)
   {
      y5=y_pos-height-2;
      x5=(x_pos + (axis_length / 5)*4-2);      
      repaint();   }  
 
   public void setPoint6(int height)
   { 
      y6=y_pos-height-2;
      x6=(x_pos + axis_length - 2);
      repaint();
   
   }   

   


}

