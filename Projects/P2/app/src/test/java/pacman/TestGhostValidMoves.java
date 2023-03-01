package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    Ghost ghost = frame.addGhost(new Location(9, 11));
    assertEquals(ghost.get_valid_moves(), {(9,12), (9,10), (10,11), (11, 11)})
    return;
  }
}
