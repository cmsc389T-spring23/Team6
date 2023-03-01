package pacman;
import java.util.ArrayList;
import java.util.HashSet;

import pacman.Map.Type;

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
    return null;
  }

  public boolean move() {
    ArrayList<Location> validMoves = get_valid_moves();
    if (validMoves == null || validMoves.size() != 0) {
      if (myMap.move(myName, validMoves.get(0), Type.GHOST) == true) {
        myLoc = validMoves.get(0);
        return true;
      }
    }
    return false;
  }

  public boolean is_pacman_in_range() {
    int x = this.myLoc.x;
    int y = this.myLoc.y;
    for(int i = x-1; i <=x+1; i++){
      for(int j = y-1; j <=y+1; j++){
        Location loc = new Location(i, j);
        if(this.myMap.getLoc(loc).contains(Map.Type.PACMAN)){
          return true;
        }
      }
    }
    return false;
  } 

  public boolean attack() {
    if(is_pacman_in_range()){
      return myMap.attack();
    }
    return false;
  }
}
