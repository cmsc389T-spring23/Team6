# cmsc389T-spring23

## Pacman Project
Kanishk Chinna, Ezana Kebede, Walker Owen, Ashley Rider


[insert image of our code running]

## How to run the code from the command line
```
gradle build
gradle run 
```


[for each function: a description of the implementation, and a description of the test you wrote]

## Pacman Class

### is_ghost_in_range()
For the PacMan's (x,y) position, check the (x-1,y-1), (x-1,y+1), (x+1,y-1), (x+1,y+1) positions for a Ghost. If a Ghost is nearby, the function returns True, otherwise return False. To test, we created two cases. In the first case, a PacMan and Ghost are one space away and True is expected. In the second case, PacMan and Ghost are several spaces away and False is expected.

### consume()
If there is a cookie at pacman's current location, this function returns that cookie object, and otherwise it returns null.
This function retrieves the HashSet of types that exist in pacman's current location and checks to see if a COOKIE enum type is in the set. It gets the HashSet of Types at that location through the Map class's public method getLoc(Location loc) associated with the Pacman class's private variable myMap, using the private variable myLoc in the Pacman class as input for getLoc. 
If this HashSet contains the Type COOKIE, then the output of the Map class's eatCookie(String name) associated with the myMap pacman variable is returned

#### consume()
If there is a cookie at pacman's current location, this function returns that cookie object, and otherwise it returns null.
This function determines if there is a cookie at pacman's location by getting the HashSet associated with pacman's current location myLoc through the getLoc() function from myMap.

If there is a COOKIE Type in this Hashset, the myMap's eatCookie() function is returned with pacman's myName variable as the input. If there was no COOKIE Type in the HashSet the function returns null.

Testing
---
The test for this function creates a test NoFrame, and then a Cookie object at position (4,5), and two pacman players; one at (4,5) and one at (2,7).

This test will pass if calling consume on the pacman at (4,5) returns the cookie object (since they are at the same location), and if calling consume on the pacman at (2,7) returns null (since the cookie and pacman are not at the same location).

### Ghost Class
### move()
Moves the Pacman to one of its valid moving locations.
The test creates a map and a pacman set to location (2,1). Then we call pacman.move().

## Ghost Class

### is_pacman_in_range()
For the Ghost's (x,y) position, check the (x-1,y-1), (x-1,y+1), (x+1,y-1), (x+1,y+1) positions for a PacMan. If a PacMan is nearby, the function returns True, otherwise return False. To test, we created two cases. In the first case, a PacMan and Ghost are one space away and True is expected. In the second case, PacMan and Ghost are several spaces away and False is expected.

### move()
Moves the Ghost to one of its valid moving locations.
The test creates a map and a red ghost named "name" and set its location to (3,4). Then we call ghost.move().

## Map Class

### attack()
Checks to see if a Ghost is able to attack a PacMan by checking `is_pacman_in_range` from the PacMan class. If a PacMan is nearby, Ghost "eats" PacMan by setting `gameover` to true and returning True. Otherwise, `gameover` doesn't get updated and False is returned. We test this by putting PacMan and Ghost nearby and expecting True to be returned and setting them multiple spaces apart and expecting False.

### getLoc(Location loc)
Returns the set of "Types" currently at location loc.
The test creates a map and adds a pacman, ghosts, and cookies throughout the map. A pacman, ghost, and cookie are put at location (2,3). map.getLoc(new Location(2, 3)) is called and we print each Type in the set.
