package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    pacman.MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    Ghost ghost = frame.addGhost(new Location(3, 4), "name", Color.red); //Creates a red ghost named "name" at location x,y
    assertTrue(ghost.move());
  }
}
