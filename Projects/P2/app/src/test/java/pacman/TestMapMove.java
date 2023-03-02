package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    MainFrame frame = new MainFrame();
    PacMan pacman = frame.addPacMan(new Location(2, 4));
    assertTrue(frame.getMap().move("pacman", new Location (2,5), Map.Type.PACMAN));
    assertTrue(frame.getMap().getLoc(new Location(2, 5)).contains(Map.Type.PACMAN));
    return;
  }
}
