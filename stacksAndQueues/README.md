# Stacks and Queues
Implementing a stack and a queue classes as generic, with their basic methods.

## Challenge10
Implementation: Stacks and Queues

## Approach & Efficiency
+ **push**
Arguments: value
adds a new node with that value to the top of the stack with an O(1) Time performance.
+ **pop**
Arguments: none
    + Returns: the value from node from the top of the stack
    + Removes the node from the top of the stack
    + Should raise exception when called on empty stack
+ **peek**
    + Arguments: none
    + Returns: Value of the node located at the top of the stack
Should raise exception when called on empty stack
+ **is empty**
    + Arguments: none
    + Returns: Boolean indicating whether or not the stack is empty.

    
## API
+ org.junit.jupiter.api.Test;
+ static org.junit.jupiter.api.Assertions.*;