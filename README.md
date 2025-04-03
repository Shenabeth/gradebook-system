# GradeBook System

A simple Java implementation of a gradebook that stores and processes student scores.

## Overview

This project provides a GradeBook class for managing student scores with functionalities to add scores, calculate sum, find minimum score, and compute final scores. It also includes a comprehensive test suite to verify all functionalities.

## Files

### GradeBook.java

The main class that implements the gradebook functionality:

- **Constructor**: Creates a new gradebook with specified capacity
- **addScore()**: Adds a score to the gradebook if space is available
- **sum()**: Calculates the total of all scores
- **minimum()**: Finds the lowest score in the gradebook
- **finalScore()**: Calculates the final score by dropping the lowest score (if there are at least two scores)
- **getScoreSize()**: Returns the current number of scores
- **toString()**: Returns a string representation of all scores

### GradeBookTester.java

A JUnit test class that verifies the correctness of the GradeBook implementation:

- Uses JUnit 5 (Jupiter) framework
- Sets up test data in the `setUp()` method
- Cleans up resources in the `tearDown()` method
- Tests all methods of the GradeBook class:
  - `testAddScore()`: Verifies scores are added correctly
  - `testSum()`: Verifies sum calculation
  - `testMinimum()`: Verifies minimum score identification
  - `testFinalScore()`: Verifies final score calculation (sum minus minimum)
  - `testGetScoreSize()`: Verifies score count tracking
  - `testToString()`: Verifies string representation

## Usage

### Creating a GradeBook

```java
// Create a gradebook that can hold up to 5 scores
GradeBook myGradebook = new GradeBook(5);
```

### Adding Scores

```java
myGradebook.addScore(95.5);
myGradebook.addScore(87.0);
myGradebook.addScore(91.5);
```

### Calculating Statistics

```java
// Get the sum of all scores
double total = myGradebook.sum();

// Find the minimum score
double lowestScore = myGradebook.minimum();

// Calculate the final score (sum minus the lowest score)
double finalScore = myGradebook.finalScore();

// Get the number of scores stored
int count = myGradebook.getScoreSize();

// Display all scores
System.out.println("Scores: " + myGradebook.toString());
```

## Running Tests

To run the tests:

1. Make sure JUnit 5 is in your classpath
2. Execute the GradeBookTester class

## Implementation Details

- The gradebook uses a fixed-size array to store scores
- The maximum number of scores is specified at creation time
- If the gradebook is full, new scores cannot be added
- If the gradebook is empty, minimum() returns 0 and finalScore() returns 0
- If the gradebook has only one score, finalScore() returns that score
