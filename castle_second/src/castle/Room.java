package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();

    public Room(String description) 
    {
        this.description = description;
    }
    public void setExit(String dir, Room room){
    	exits.put(dir, room);
    }
//    public void setExits(Room north, Room east, Room south, Room west) 
//    {
//        if(north != null)
//            northExit = north;
//        if(east != null)
//            eastExit = east;
//        if(south != null)
//            southExit = south;
//        if(west != null)
//            westExit = west;
//    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc(){
    	StringBuffer sb = new StringBuffer();
    	for (String dir: exits.keySet()){
    		sb.append(dir);
    		sb.append(' ');
    	}
//    	if (northExit != null)
//    		sb.append("north ");
//    	if (eastExit != null)
//    		sb.append("east ");
//    	if (westExit != null)
//    		sb.append("west ");
//    	if (southExit != null)
//    		sb.append("south ");
    	return sb.toString();
    }
    
//    public Room getRoom(String direction){
//    	Room ret = null;
//    	if(direction.equals("north")) {
//            ret = northExit;
//        }
//        if(direction.equals("east")) {
//            ret = eastExit;
//        }
//        if(direction.equals("south")) {
//            ret = southExit;
//        }
//        if(direction.equals("west")) {
//            ret = westExit;
//        }
//    	return ret;
//    }
    public Room getExit(String direction){
    	Room ret = null;
    	ret = exits.get(direction);
    	return ret;
    }
}
