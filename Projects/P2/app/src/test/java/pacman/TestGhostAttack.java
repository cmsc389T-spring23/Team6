package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Player
    PacMan pacman1 = frame.addPacMan(new Location(4,5)); //Creates PacMan at same location as a ghost

    //Creating Ghosts
    Ghost ghost1 = frame.addGhost(new Location(4,5), "ghost1", Color.cyan);
    Ghost ghost2 = frame.addGhost(new Location(2,3), "ghost2", Color.pink);

    // Assert that cookies are removed when eaten, and pacman cannot eat a cookie that isn't there
    assertEquals(ghost1.attack(), frame.getMap().attack());
    // Assert that the cookie counter is not being incremented when no cookie is eaten
    assertEquals(ghost2.attack(), false);

    return;
  }
}
