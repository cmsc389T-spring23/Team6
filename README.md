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
### Pacman Class

#### consume()
If there is a cookie at pacman's current location, this function returns that cookie object, and otherwise it returns null.
This function retrieves the HashSet of types that exist in pacman's current location and checks to see if a COOKIE enum type is in the set. It gets the HashSet of Types at that location through the Map class's public method getLoc(Location loc) associated with the Pacman class's private variable myMap, using the private variable myLoc in the Pacman class as input for getLoc. 
If this HashSet contains the Type COOKIE, then the output of the Map class's eatCookie(String name) associated with the myMap pacman variable is returned

### move()
Moves the Pacman to one of its valid moving locations.
The test creates a map and a pacman set to location (2,1). Then we call pacman.move().

### Ghost Class


### Map Class

