package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    // test
    MainFrame frame = new MainFrame();
    Location myLoc = new Location(2, 3);
    Ghost ghost = frame.addGhost(myLoc, "name", Color.red);
    // ArrayList<Location> loc = new ArrayList<>();
    // ArrayList<Location> comps = new ArrayList<>();
    // loc.add(myLoc.shift(0, -1));
    // loc.add(new Location(0, 1));
    // loc.add(new Location(-1, 0));
    // loc.add(new Location(1, 0));
    // for (int i = 0; i < loc.size(); i++) {
    //   if (frame.getMap().getLoc(loc.get(i)) != null && 
    //       frame.getMap().getLoc(loc.get(i)).contains(Map.Type.WALL) == false) {
    //     comps.add(loc.get(i));
    //   }
    // }
    // System.out.println(comps.size());
    // System.out.println(ghost.get_valid_moves().size());
    assertEquals(ghost.get_valid_moves().size(), 2);
    return;
  }
}
