# Hash Maps data structure

## What is it?
A hash map (known as a dictionary in Python) is a data structure that
stores key: value pairs and averages an O(1) lookup, insertion and
deletion.

Note that this is faster then an unsorted array of O(n)

## How does it work?

#### What is a hash?
Is a typically a fixed size value used to represent 
an input (generated from a hash function). The hash 
is what is used to determine where the key: value
pair should be stored within a hash map.

#### The hash function
This function takes the key as an input and generates a hash 
value. The hash value then is used to determine where the pair
should be stored.

This allows a hash map to quickly find the location of the data
associated with a key instead of performing a linear search.

## How to recognize it in a problem?
Common problem clues:
- quickly lookup if something exists.
- count occurencies/frequencies.
- find duplicates.
- associate a piece of data with another.
- remember values that have already been seen.
- A brute force O(n^2) solution can potentially be reduced with a hash map.

## Time and Space complexity
Time:
- Average = O(1)
- Worst case = O(n)

Space:
- O(n)

### Other important notes
In Python each key needs to be an immutable data type (string, int, tuple)
this is because each key needs to be hashable. The value of a key must
be consistent while it is stored in a hash map. If a key is modified then
the hash map will not reliably be able to locate the key.
