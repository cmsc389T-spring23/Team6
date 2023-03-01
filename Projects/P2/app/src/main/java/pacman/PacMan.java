package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    int x = this.myLoc.x;
    int y = this.myLoc.y;
    for(int i = x-1; i <=x+1; i++){
      for(int j = y-1; j <=y+1; j++){
        Location loc = new Location(i, j);
        if(this.myMap.getLoc(loc).contains(Map.Type.GHOST)){
          return true;
        }
      }
    }
    return false;
  }

  public JComponent consume() {
    if(myMap.getLoc(myLoc).containsKey(myMap.Type.COOKIE)){
      return myMap.eatCookie(myName);
    }
    return null;
  }
}
