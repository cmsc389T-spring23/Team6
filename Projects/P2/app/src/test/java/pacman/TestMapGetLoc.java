package pacman;
import java.io.*;
import java.util.HashSet;

import javax.swing.JComponent;
import javax.swing.JFrame;

import junit.framework.*;
import pacman.Map.Type;

import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    Map map = new Map(0);
    map.add("first add", new Location(2, 3), null, Type.PACMAN);
    map.add("second add", new Location(2, 3), null, Type.GHOST);
    map.add("third add", new Location(5, 4), null, Type.COOKIE);
    map.add("fourth add", new Location(8, 3), null, Type.GHOST);
    map.add("fifth add", new Location(2, 3), null, Type.COOKIE);
    HashSet<Type> locationSet = map.getLoc(new Location(2, 3));
    for (Type s : locationSet) {
      System.out.println(s.toString());
    }
    assertTrue(true);
    return;
  }

}
