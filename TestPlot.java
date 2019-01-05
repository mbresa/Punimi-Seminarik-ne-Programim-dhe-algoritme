import javax.swing.*;
public class TestPlot
{
public static void main(String[] a)
  { String s1= JOptionPane.showInputDialog("Vlera maksimale e boshtit Ox");
    String s2= JOptionPane.showInputDialog("Vlera maksimale e boshtit Oy");
    int y0=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 0")); 
    int y1=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 1"));
    int y2=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 2"));
    int y3=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 3"));
    int y4=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 4"));
    int y5=Integer.parseInt(JOptionPane.showInputDialog("Vlera e pikes 5"));
    PointGraphWriter e = new  PointGraphWriter();
    e.setAxes(100, 100, 400, s1, s2);
    double scale_factor = 400.0/new Double(s2).doubleValue();
    e.setPoint1( (int)(y0 * scale_factor));   
    e.setPoint2( (int)(y1 * scale_factor));   
    e.setPoint3( (int)(y2 * scale_factor));  
    e.setPoint4( (int)(y3 * scale_factor));  
    e.setPoint5( (int)(y4 * scale_factor));
    e.setPoint6( (int)(y5 * scale_factor));
  }

}