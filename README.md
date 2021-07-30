# Bubble Sort, Linear Search & Binary Search
Simple Java console application to demonstrate bubble sorting of integer array and compare linear search to binary search.

### Methods:
| Method       | Description     |
| ------------ | --------------- |
| getInt       | Gets `Scanner(System.in)` and tries to parse it to an Integer. <br/> If successful, saves result to a `static int`. <br/> Returns a Boolean. |
| bubbleSort   | Gets `int[]` (integer array). Sorts the array using bubble sort <br/> and returns the number of swaps necessary to <br/> complete the task |
| linearSearch | Gets `int[]` (integer array - "haystack") and `int` ("needle"). <br/> Search linearly for the needle in the haystack. </br> Returns the index if found, or -1 if not. <br/> Also registers the number of comparisons necessary to complete the task. |
| binarySearch | Gets `int[]` (integer array - "haystack") and `int` ("needle"). <br/> Search for the needle in the haystack using binary search. </br> Returns the index if found, or -1 if not. <br/> Also registers the number of comparisons necessary to complete the task. |
| printArray   | Gets `int[]` (integer array) and displays it in the console. |
