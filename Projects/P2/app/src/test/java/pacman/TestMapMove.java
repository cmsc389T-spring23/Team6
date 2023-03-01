package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(2, 4));
    assertTrue(map.move("pacman", new Location (2,5), Map.Type.PACMAN))
    return;
  }
}
