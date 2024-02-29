import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circle extends SimpleShape{
  
    protected int radius;
    
    public Circle(int r) {
       radius = r;
       xLoc += radius + 10;    
    }
    
    public String toString()
    {
        String starter = super.toString();
        return String.format("%s Circle",starter);
    }   
    
    public Shape draw()
    {
        return new Ellipse2D.Double(x,y,radius,radius);
    }
    
     public void calculateArea(){ 
        area = Math.PI * Math.pow(radius,2);
    }
}
