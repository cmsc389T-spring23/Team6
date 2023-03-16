package pacman;

import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc))
      field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    if (locations.get(name) != null && field.get(loc) != null && components.get(name) != null) {
      locations.put(name, loc);
      field.get(loc).add(type);
      components.get(name).setLocation(loc.x, loc.y);
      return true;
    }
    return false;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method
    return null;  // changed from "field.get(loc)" to "null"
  }

  public boolean attack(String Name) {
    //get location of pacman
    Ghost ghost = new Ghost("name", locations.get(Name), this);
    //Location pacman = locations.get(Name);
    if(ghost.is_pacman_in_range() == true){
      // update gameOver
      gameOver = true;
      return false;
    }else{
      return true;
    }
   
    
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1
    if (!name.equals("pacman")){
      return null;
    }
    Location pacman_loc = locations.get(name);
    if (field.get(pacman_loc).contains(Type.COOKIE)){
      cookies++;
      String cookie_name = "tok_x" + pacman_loc.x + "_y" + pacman_loc.y;
      JComponent cookie_component = components.get(cookie_name);

      field.get(pacman_loc).remove(Type.COOKIE);
      locations.remove(cookie_name);
      components.remove(cookie_name);
      return cookie_component;
    }
    return null;
  }
}
