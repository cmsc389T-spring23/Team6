package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    //Creating A Map
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Cookies
    cookie_true = createCookie(frame, 4, 5);

    //Creating Player
    PacMan pacman1 = frame.addPacMan(new Location(4, 5)); //Creates PacMan at same location as cookie

    //Number of cookies before eating
    numCookies = frame.getMap().getCookies();

    //Assert that a consumed cookie returns its cookie token,
    // and that cookies are removed once eaten
    assertEquals(frame.getMap().eatCookie("pacman"), cookie_true);
    // Assert that the cookie counter is being incremented
    assertEquals(frame.getMap().getCookies(), numCookies-1);

    // Assert that cookies are removed when eaten, and pacman cannot eat a cookie that isn't there
    assertEquals(frame.getMap().eatCookie("pacman"), null);
    // Assert that the cookie counter is not being incremented when no cookie is eaten
    assertEquals(frame.getMap().getCookies(), numCookies-1);

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
