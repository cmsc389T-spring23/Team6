package pacman;
import junit.framework.*;
import java.io.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    //Creating A Map
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red); //Creates a red ghost named "name" at location x,y
    Ghost ghost = frame.addGhost(new Location(1, 1), "Bob", Color.red);
    PacMan pacman = frame.addPacMan(new Location(5, 4)); //Creates PacMan at location x, y

    assertEquals(false, frame.attack("Bob"));
    assertEquals(true, frame.attack("name"));
  }
}
