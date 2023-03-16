package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    pacman.MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    PacMan pacman = frame.addPacMan(new Location(2, 1)); //Creates PacMan at location x, y
    assertTrue(pacman.move());
  }
}
