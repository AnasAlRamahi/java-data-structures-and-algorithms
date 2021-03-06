# Challenge26: Insertion Sort
Write a method that takes in an array of integers and sorts them in an ascending order using insertion sort algorithm.

### Approach & Efficiency
**First loop:** begins with the second element of the array checking the elements behind it every iteration until the end of the array.

**Second loop:** to shift every element that is bigger than the reached element one position until reaching the right position, we add the reached element inside to have the ordered array.

### Whiteboard Process
![CodeChallenge26](challenge26.PNG)

### Blog for challenge 26:
[Blog26](Blogs/Blog26.md)


# Challenge27: Merge Sort
Write a method that takes in an array of integers and sorts them in an ascending order using merge sort algorithm.

### Approach & Efficiency
**Recursion:** splits the array into 2 seperated arrays, left, and right, and then makes a recursive call on the left, then on the right, then calls another method to order the returned array.

**Inner loop:** It is responsible for the ordering of the sub arrays, when there are no left or right left to call the recursive function.

### Whiteboard Process
![CodeChallenge27](codeChallenge27.PNG)

### Blog for challenge 27:
[Blog27](Blogs/Blog27.md)


### Approach & Efficiency
**Partition** this method is called at first, which return the position of the pivot in it's right place while the elements in the right are higher and on the left are lower. All of this will happen in the partition method.

It assigns the last elemnt on the right to be the pivot, then it compares it to the rest of the passed array, and put all the higher elements on the right and the lower on the left. Then it exits the loop and places the pivot in the middle between the right and left side, which is the right place for it.

**Recursion:** it will recursively call the partition for the unordered left and right sides until we have only one or two elements of the array.

### Whiteboard Process
![CodeChallenge28](codeChallenge28.PNG)

### Blog for challenge 28:
[Blog28](Blogs/Blog28.md)

