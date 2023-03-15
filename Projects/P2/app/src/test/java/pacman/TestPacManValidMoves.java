package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    // test
    MainFrame frame = new MainFrame();
    PacMan pac = frame.addPacMan(new Location(2, 3));
    // ArrayList<Location> loc = new ArrayList<>();
    // ArrayList<Location> comps = new ArrayList<>();
    // loc.add(new Location(9, 12));
    // loc.add(new Location(9, 10));
    // loc.add(new Location(10, 11));
    // loc.add(new Location(11, 11));
    /*for (int i = 0; i < loc.size(); i++) {
      if (frame.getMap().getLoc(loc.get(i)).contains(Map.Type.WALL) == false) {
        comps.add(loc.get(i));
      }
    }
    assertEquals(ghost.get_valid_moves(), loc);*/
    assertEquals(pac.get_valid_moves().size(), 2);

  }
}
