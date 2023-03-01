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
    return null;
  }

  public boolean move() {
    ArrayList validMoves = get_valid_moves();
    if (validMoves.size() != 0) {
      if (myMap.move(myName, validMoves.get(0), Type.PACMAN) == true) {
        myLoc = validMoves.get(0);
        return true;
      }
    }
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
