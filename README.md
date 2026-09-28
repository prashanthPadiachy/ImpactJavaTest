## Impact Java Take Home Test
## By Prashanth Padiachy

Implementation of the provided NumberRangeSummarizer Interface

The program takes a comma-separated list of integers and summarizes consecutive numbers as ranges.

Example:
    Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
    Result: "1, 3, 6-8, 12-15, 21-24, 31"

## Requirements
Java 8 or later
Apache Maven

## Implementation
App.java implements the given interface, NumberRangeSummarizer.java
    collect(String input) converts the input into a list of integers.
    summarizeCollection(Collection<Integer> input) groups consecutive numbers into ranges and returns the summarized string.

The main method in App.java accepts input from the terminal and performs collect and summarizeCollection on that input
Empty inputs and whitespaces are handled by the program

Unit Testing is done through the AppTest.java class
These can be run using 'mvn test' 

## Assumptions:

1. The order of the input is preserved; the implementation does not sort the values. Thus, consecutive ranges are identified according to the order in which the numbers are given. (i.e the program will not sort the inputted list before summarizing the ranges)
2. Whitespaces are allowed surrounding numbers and commas

