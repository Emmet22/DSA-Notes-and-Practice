# Two Pointers

## What is it?
This is an algorithmic problem solving pattern. It works by having 2 variables 
keep track of separate positions in a linear data structure.

This pattern is used commonly with:
- arrays
- linked lists
- strings (array of chars)

The main idea for this algorithm is that it allows to make progress in scanning a linear data 
structure without having to repeatedly scan it, eliminating any unnecessary work.

## How does it work?
2 variables point to (e.g.) an index in an array, and you would move them strategically
to reduce unnecessary work such as repeatedly scanning the array.

## How to recognize it in a problem?
the following are clues in a problem statement to use this pattern:
- the array is sorted
- looking for a pair or relationship between 2 elements
- comparing elements from opposite ends
- removing/filtering data in place

## Time and space complexity
Time:
- O(n) when u scan through the data once.

Space:
- O(1) as you don't create another array

## Example pseudocode

#### This is for opposite direction pointers
left = first index
right = last index

While left < right:
  examine left and right

  if condition is satisfied:
    return/etc.
  else if larger value is needed:
    move left forward
  else
    move right backwards
