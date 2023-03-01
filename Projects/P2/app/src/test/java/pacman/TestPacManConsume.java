package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestPacManConsume extends TestCase {

  public void testPacManConsume() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Cookie 
    cookie_true = createCookie(frame, 4, 5);

    //Creating Player
    PacMan pacman1 = frame.addPacMan(new Location(4, 5)); //Creates PacMan at same location as cookie
    PacMan pacman2 = frame.addPacMan(new Location(2, 7)); //Creates PacMan at different location from cookie

    //Assert that a consumed cookie returns its cookie token
    assertEquals(pacman1.consume(), cookie_true);
    assertEquals(pacman2.consume(), null);

    return;
  }

  private CookieComponent createCookie(frame, row, col){
    myMap = frame.getMap();
    Location loc = new Location(row, col);
    CookieComponent tok = new CookieComponent(loc.x, loc.y, frame.scale);
    myMap.add("tok_x" + row + "_y" + col, loc, tok, Map.Type.COOKIE);
    tok.setLocation(row, col);

    return tok;
  }
}
