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
    return false;
  }

  public boolean attack() {
    return false;
  }
}
