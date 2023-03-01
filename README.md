# cmsc389T-spring23

## Pacman Project
Kanishk Chinna, Ezana Kebede, Walker Owen, Ashley Rider


[insert image of our code running]
[how to run the code from the command line]



[for each function: a description of the implementation, and a description of the test you wrote]
### Pacman Class

#### consume()
If there is a cookie at pacman's current location, this function returns that cookie object, and otherwise it returns null.
This function determines if there is a cookie at pacman's location by getting the HashSet associated with pacman's current location myLoc through the getLoc() function from myMap.

If there is a COOKIE Type in this Hashset, the myMap's eatCookie() function is returned with pacman's myName variable as the input. If there was no COOKIE Type in the HashSet the function returns null.

Testing
---
The test for this function creates a test NoFrame, and then a Cookie object at position (4,5), and two pacman players; one at (4,5) and one at (2,7).

This test will pass if calling consume on the pacman at (4,5) returns the cookie object (since they are at the same location), and if calling consume on the pacman at (2,7) returns null (since the cookie and pacman are not at the same location).

### Ghost Class


### Map Class

