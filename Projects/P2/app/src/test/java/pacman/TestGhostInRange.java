package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    //Creating A Map
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    //NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(2, 2), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(2, 1)); //Creates PacMan at location x, y
    PacMan pacman2 = frame.addPacMan(new Location(5,5));
    assertEquals(true, pacman.is_ghost_in_range());
    assertEquals(false, pacman2.is_ghost_in_range());
  } 
}
