# Lecture Activity 10 - Instructions

In lecture activity 10, we will practice writing objects & classes. 

## General instructions for creating Java files

For each of the following Tasks, create a separate Java file called task1.java, task2.java, task3.java etc... 

Remember, to create a new file, first navigate to this directory locally using `cd path/to/this/repo` and then type: `code task1.java`.
This will open a new file called `task1.java` in Visual Studio Code.
You can also work in Geany, or Eclipse, it's your choice.


```
public class task1 {

	public static void main(String[] args) {
	  // Enter your code
	}
  
}
```

## Task 1: Stocks as Classes
Write a test program that creates a Stock object with the stock symbol SUNW, the name Sun MicroSystems Inc., and the previous closing price of 34.5. Set a new current price to 34.35 and display the price-change percentage.

Design the Stock class such that it contains:
- Four private attributes: 
- String symbol for the stock’s symbol.
- String name for the stock’s name.
- double prevClosingPrice that stores the stock price for the previous day.
- double currentPrice that stores the stock price for the current time.
- A two-argument constructor that creates a stock with the specified symbol and name.
- Getter and setter methods for name, prevClosingPrice, and currentPrice.
- A method named getChangePercent() that returns the percentage changed from prevClosingPrice to currentPrice.

### Sample Run
```
Stock Name: Sun MicroSystems Inc.
Previous Closing Price: 34.5
Current Price: 34.35
Price Change: -0.434782608695648%
```
 
## Task 2: Stopwatches
Write a test program that measures the execution time of creating an array of 1,000,000 random numbers and sorting them using Arrays.sort() method. 

You can use the static method: System.currentTimeMillis() to read the current time in milliseconds. 

Design a class named StopWatch that contains:
- Private data fields startTime and endTime.
- A method named start() that sets the startTime to the current time.
- A method named stop() that sets the endTime to the current time.
- A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.

### Sample Run
```
The elapsed time is 222ms
```

## Task 3: Quadratic Equation Class
Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display the two roots. If the discriminant is 0, display the one root. Otherwise, display “The equation has no real roots.”

Design a class named QuadraticEquation for a quadratic equation. The class contains:
- Private data fields a, b, and c that represent three coefficients.
- A constructor to set a, b, and c.
- Three getter methods for a, b, and c.
- A method getDiscriminant() that returns the discriminant b^2 - 4 * a * c
- Two methods getRealRoot1() and getRealRoot2(). If the discriminant is nonnegative, the methods should return the two roots of the equation:

  ![image](https://user-images.githubusercontent.com/9085976/111852633-f0d70600-88d4-11eb-90ac-999e67f93867.png)
  
  However, if the discriminant is negative, let these methods return 0.
  

### Sample Run

```
Enter a, b, c: 2 -4 -6
The roots are 3.0 and -1.0

Enter a, b, c: 1 -4 4
The root is 2.0

Enter a, b, c: 2 4 6
The equation has no real roots
```

 
## Task 4: Update your README file 

If you named your files as suggested above, you do not have to do anything in this section.
If you named your files differently, please update the links below to make sure they work.

[Task 1 Java file](./task1.java)

[Task 2 Java file](./task2.java)

[Task 3 Java file](./task3.java)
