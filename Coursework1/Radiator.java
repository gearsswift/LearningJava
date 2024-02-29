public class Radiator
{
  private int radiatorID;
  private static int count = 1000;
  private Room room;
  
  public Radiator()
  {
     count+= 10;
     radiatorID = count;
  }
  
  public int id()
  {
      return radiatorID;  
  }
  
  public void heats(Room rm)
  {
    room = rm;
  }
  
  public Room GetRoom()
  {
      return room;  
  }
  
  public boolean equals(Object obj)
  {
      if(obj instanceof Radiator){
          Radiator r = (Radiator)obj;
          return r.id() == radiatorID;
      }  
      return false;
  }
  
  public String toString()
  {
      if(room == null)
          return String.format("%d Room: unassigned",radiatorID)  ;
      else
          return String.format("%d Room: %s",radiatorID,room.GetRoomName())  ;
  }
}
