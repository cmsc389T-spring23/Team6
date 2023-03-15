package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

import pacman.Map.Type;

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
    ArrayList<Location> ret = new ArrayList<Location>();
    Location u = myLoc.shift(0,-1);
    Location d = myLoc.shift(0,1);
    Location l = myLoc.shift(-1,0);
    Location r = myLoc.shift(1,0);

    if (myMap.getLoc(u) != null && myMap.getLoc(u).contains(Map.Type.WALL) == false) {
      ret.add(u);
    }
    if (myMap.getLoc(d) != null && myMap.getLoc(d).contains(Map.Type.WALL) == false) {
      ret.add(d);
    }
    if (myMap.getLoc(l) != null && myMap.getLoc(l).contains(Map.Type.WALL) == false) {
      ret.add(l);
    }
    if (myMap.getLoc(r) != null && myMap.getLoc(r).contains(Map.Type.WALL) == false) {
      ret.add(r);
    }
  
    return new ArrayList<Location>();
  }

  public boolean move() {
    ArrayList<Location> validMoves = get_valid_moves();
    if (validMoves == null || validMoves.size() != 0) {
      if (myMap.move(myName, validMoves.get(0), Type.PACMAN) == true) {
        myLoc = validMoves.get(0);
        return true;
      }
    }
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
    if(myMap.getLoc(myLoc).contains(Type.COOKIE)){
      return myMap.eatCookie(myName);
    }
    return null;
  }
}
