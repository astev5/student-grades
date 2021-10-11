# student-grades
A program using single-dimensional arrays to accept and analyze student grade data.

## Assignment
Write a program that accepts a number of grades, prints each grade's letter grade equivalent, the high and low grades and the average of the number of grades entered.

## Constraints
- The user can enter a number of grades from 1 to 99.
- The user can run the program as many times as they wish.

## Requirements
- Ask the user for a number of grades between 1 and 99.
- Use that number to allocate the size of a single-dimension array.
- Implement five methods that do the following:
  1. Accepts the array and randomly selects grades (of type double) between 55 and 100 and places them into the array.
  2. Outputs each grade from the array, assigning it a number and a letter grade in the following format: "Grade 1: 69.74 is a C-"
  3. Outputs the lowest grade from the array.
  4. Outputs the highest grade from the array.
  5. Outputs the average of the grades from the array.
- Only method 2 can be a void method. The others must return a value.
- Implement a loop to allow the user to repeat the program.
- Use formatted output.
- Round results to 2 decimal places.

## Notes
- Round values when determing letter grades.
- Output should begin with 1, not 0 ex: "Grade 1..."
