package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(9, 11));
    assertEquals(pacman.get_valid_moves(), {(9,12), (9,10), (10,11), (11, 11)})
    return;
  }
}
