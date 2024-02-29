import java.awt.Color;
public class ShapeRunner{
   public static void main(String[] args){
     SimpleShape shapes[] = new SimpleShape[5];
     
     ShapeScreen s = new ShapeScreen(shapes);
     shapes[0] = new SimpleShape();
     shapes[1] = new Rectangle(50,100);
     shapes[2] = new Circle(50);
     shapes[3] = new Circle(30);
     shapes[4] = new Rectangle(300,100);
     for(SimpleShape ss: shapes)
     {
         System.out.println(ss.toString());  
     }  
     for(int i = 1; i < shapes.length; i++)
     {
        if(shapes[i] instanceof Rectangle)
        {
            Rectangle r = (Rectangle)shapes[i];
            r.roundEdge(35);
            shapes[i].setColor(Color.blue);
        }
        if(i == 3)  
            shapes[i].setColor(Color.red);
     }
   }
}
