import java.util.ArrayList;

public class Room
{
   private String roomName;
   private ArrayList<Radiator> radiators;
       
   public Room()
   {
      radiators =  new ArrayList<Radiator>();
   }
   
   public String GetRoomName()
   {
       return roomName; 
   }
   
   public void SetRoomName(String name)
   {
       roomName = name; 
   }
   
   public ArrayList<Radiator> GetRadiators()
   {
       return radiators; 
   }
   
   public String isHeatedBy(Radiator rd)
   {
        int size = radiators.size();
        for(int i = 0; i < size; i++)
        {
            if(radiators.get(i).equals(rd))
                return String.format("Radiator %d already added to room %s",rd.id(),roomName);
        }
        if(size == 2)
            return "Cannot add Radiator. Room has maximum number of radiators";
        else
        {
            radiators.add(rd);
            rd.heats(this);
            return String.format("Radiator %d  added to room %s",rd.id(),roomName);
        }
   }
   
   public String toString()
   {
       return String.format("%s %d",roomName, radiators.size()); 
   }
}
