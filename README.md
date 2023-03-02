# Pacman Project - Team 6
Team members: Kanishk Chinna, Ezana Kebede, Walker Owen, Ashley Rider

## How to run the code from the command line
```
gradle build
gradle run 
```

## Pacman Class

### get_valid_moves()
This method takes in no arguments but returns an ArrayList of Locations that represent the valid places the current Pacman can move.
It checks 4 cardinal directions to make sure no wall exists in that area.
An empty ArrayList will be returned if there exists no valid moves.

### is_ghost_in_range()
For the PacMan's (x,y) position, check the (x-1,y-1), (x-1,y+1), (x+1,y-1), (x+1,y+1) positions for a Ghost. If a Ghost is nearby, the function returns True, otherwise return False. To test, we created two cases. In the first case, a PacMan and Ghost are one space away and True is expected. In the second case, PacMan and Ghost are several spaces away and False is expected.

### consume()
If there is a cookie at pacman's current location, this function returns that cookie object, and otherwise it returns null.

This function determines if there is a cookie at pacman's location by getting the HashSet associated with pacman's current location 'myLoc' through the `getLoc` function from 'myMap'.

If there is a COOKIE Type in this Hashset, the myMap's `eatCookie` function is returned with pacman's 'myName' variable as the input. If there was no COOKIE Type in the HashSet the function returns null.

The test for this function creates a test NoFrame, and then a Cookie object at position (4,5), and two pacman players: one at (4,5) and one at (2,7).

This test will pass if calling `consume` on the pacman at (4,5) returns the cookie object (since they are at the same location), and if calling `consume` on the pacman at (2,7) returns null (since the cookie and pacman are not at the same location).


### move()
Moves the Pacman to one of its valid moving locations.
The test creates a map and a pacman set to location (2,1). Then we call pacman.move().

## Ghost Class

### get_valid_moves()
This method takes in no arguments but returns an ArrayList of Locations that represent the valid places the current Ghost can move.
Will check 4 cardinal directions to make sure no wall exists in that area.
An empty ArrayList will be returned if there exists no valid moves.

### is_pacman_in_range()
For the Ghost's (x,y) position, check the (x-1,y-1), (x-1,y+1), (x+1,y-1), (x+1,y+1) positions for a PacMan. If a PacMan is nearby, the function returns True, otherwise return False. To test, we created two cases. In the first case, a PacMan and Ghost are one space away and True is expected. In the second case, PacMan and Ghost are several spaces away and False is expected.

### move()
Moves the Ghost to one of its valid moving locations.
The test creates a map and a red ghost named "name" and set its location to (3,4). Then we call ghost.move().

### attack()
This function returns true if the attack was successful, and false if it failed.
This function utilizes the `is_pacman_in_range` function to determine if the pacman is in range for attack, and if so, then the Map class (as the Ghost's 'myMap' variable) `attack` function is returned. Otherwise if the pacman is not in range, this function retuns false.

The test for this function creates two Ghosts and one Pacman. The Pacman is at (4,5), one Ghost is at (4,5), and one is at (2,3). The test will pass if the `attack` method for the Ghost at the same location as Pacman returns the same output as the `Map.attack`, and when calling `attack` on the Ghost at (2,3) returns false.

## Map Class

### move()
Takes in the name of the object to be moved, the new location, and the type of the object.
Error handling to make sure that the object with this name and type exist and that the location is valid.
Updates locations map entry with the current name to new location.
Adds type to field entry at new location.
Sets new location for component.

### attack()
Checks to see if a Ghost is able to attack a PacMan by checking `is_pacman_in_range` from the PacMan class. If a PacMan is nearby, Ghost "eats" PacMan by setting `gameover` to true and returning True. Otherwise, `gameover` doesn't get updated and False is returned. We test this by putting PacMan and Ghost nearby and expecting True to be returned and setting them multiple spaces apart and expecting False.

### getLoc(Location loc)
Returns the set of "Types" currently at location loc.
The test creates a map and adds a pacman, ghosts, and cookies throughout the map. A pacman, ghost, and cookie are put at location (2,3). map.getLoc(new Location(2, 3)) is called and we print each Type in the set.

### eatCookie(String name)
This function verifies that the name passed in is "pacman", and if not it immediately returns null.
Otheriwse, the function returns the eaten cookie component if there is a cookie at pacman's current location, and null if not.

If the name is correct, it gets the pacman's location by looking up its name in the 'locations' HashMap, and verifying that the type COOKIE is in the HashSet associated with that location.

The amount of cookies then is incremented, the cookie name is constructed in accordance with the format `"tok_x" + pacman_loc.x + "_y" + pacman_loc.y`, the cookie component is retrieved by this name and a copy saved as a variable. The original cookie object is then removed from the field, locations, and components HashMaps, and the copy is returned.

This function is tested by creating a pacman and cookie object at the same location, and it passes if eatCookie returns the cookie object when called, if the number of cookies is increased; and if a second call returns null (to verify that the cookie was indeed eaten, and that null is returned when there is no cookie), and the number of cookies does not change.

## Image of code playing Pacman
<img width="591" alt="Screenshot 2023-03-01 at 9 35 01 PM" src="https://user-images.githubusercontent.com/91798586/222316354-2519c60f-2e58-4800-b34c-90d62318c88b.png">
