package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11), "name", Color.red);
    ArrayList<Location> loc = new ArrayList<>();
    ArrayList<Location> comps = new ArrayList<>();
    loc.add(new Location(9, 12));
    loc.add(new Location(9, 10));
    loc.add(new Location(10, 11));
    loc.add(new Location(11, 11));
    for (int i = 0; i < loc.size(); i++) {
      if (frame.getMap().getLoc(loc.get(i)).contains(Map.Type.WALL) == false) {
        comps.add(loc.get(i));
      }
    }
    assertEquals(ghost.get_valid_moves(), loc);
    return;
  }
}
