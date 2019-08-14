# This repo holds the first 10 java labs from codefellows 401.
# Lab 6 - [Inheritance](https://github.com/kdcouture/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)
## ReviewableBusiness.java
- This file holds the abstract ReviewableBusiness class and its related methods.
--- 
- addReview -- This method adds a review to the Restaurant class instance.
- updateStars -- This method helps the addReview method to keep the start rating correct.
---
## Restaurant.java
- This file holds the Restaurant class and its related methods. Extends ReviewableBusiness.
---
- toString -- This method returns a string about the Restaurant object.
---
## Shop.java
- This file holds the abstract Shop class and its related methods. Extends ReviewableBusiness.
---
- toString -- This method returns a string about the Shop object.
---
## Theater.java
- This file holds the abstract Theater class and its related methods. Uses MovieReview instead of Reviews as well as addtions Arraylist of Strings holding the current movies at the Theater. Extends ReviewableBusiness.
---
- addMovie -- Adds a movie to the array list of strings.
- addReview -- Overrides the parent class to add MoviewReviews insted of Review classes.
- updatestars -- Overrides the parent class to iterate over MoviewReviews instead of Reviews.
- toString -- This method returns a string about the Theater object.
---
## Review.java
- This file holds information regarding the Review class.
---
- toString -- This function returns a string with info about the Review instance. 
## MovieReview.java
- This file inherets from the Review class and adds the addtion of a movie title string. Extends Review.
---
- toString -- This function returns a string with info about the MovieReview instance.
---
# Lab 3 - [basiclibrary](https://github.com/kdcouture/java-fundamentals/tree/master/basiclibrary)
## basicLibrary.java
- analyzeWeather -- This function takes in a 2d integer array and computers the min, max and displays a list of values not seen in the input array's values.
- tallyVotes -- This function takes in a List of Strings and our output is the String with the most occurences in the list.
## [linter](https://github.com/kdcouture/java-fundamentals/tree/master/linter) 
- [App.java](https://github.com/kdcouture/java-fundamentals/tree/master/linter/src/main/java/linter) -- The linter we made functions to check if lines that require a semi-colon actually have it present.
# Lab 2 - [basiclibrary](https://github.com/kdcouture/java-fundamentals/tree/master/basiclibrary)
## Lab2.java
- roll -- This function takes in an integer (n) and outputs an array length of (n) containing numbers between 1-6.
- containsDuplicates -- This fuction takes in an integer array and outputs true if there are any duplicates and flase if there are not.
- calculate average -- This function takes in an integer array and outputs the average of the values.
- calc. min average -- This function takes in a 2d integer array and outputs the array with the min avg.
# Lab 1 - [basics](https://github.com/kdcouture/java-fundamentals/tree/master/basics)
## Main.java
- pluralize -- This function takes in a string and an integer, outputs the string and adds an 's'  if needed.
- flipNHeads -- This function uses math.random and an inputed integer (n) to "flip" coins until you get (n) heads in a row.
- clock -- This function prints the current time every second until the users stops it via control+C.
