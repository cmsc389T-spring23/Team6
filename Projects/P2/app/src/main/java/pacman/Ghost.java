package pacman;
import java.util.ArrayList;
import java.util.HashSet;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> ret = new ArrayList<Location>();
    Location u = myLoc.shift(0,-1);
    Location d = myLoc.shift(0,1);
    Location l = myLoc.shift(-1,0);
    Location r = myLoc.shift(1,0);

    if (myMap.getLoc(u).contains(Map.Type.WALL) == false) {
      ret.add(u);
    }
    if (myMap.getLoc(d).contains(Map.Type.WALL) == false) {
      ret.add(d);
    }
    if (myMap.getLoc(l).contains(Map.Type.WALL) == false) {
      ret.add(l);
    }
    if (myMap.getLoc(r).contains(Map.Type.WALL) == false) {
      ret.add(r);
    }
  
    return ret;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
