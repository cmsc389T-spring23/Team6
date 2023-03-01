package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
      //Creating A Map
      MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
      //NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
   
      //Creating Players
      PacMan pacman = frame.addPacMan(new Location(2, 2)); //Creates a red ghost named "name" at location x,y
      Ghost ghost = frame.addGhost(new Location(2, 1), "Bob", Color.red); //Creates PacMan at location x, y
      Ghost ghost2 = frame.addGhost(new Location(5,5), "John", Color.blue);
      assertEquals(true, ghost.is_pacman_in_range());
      assertEquals(false, ghost2.is_pacman_in_range());
  }
}
