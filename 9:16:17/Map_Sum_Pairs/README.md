Implement a MapSum class with insert, and sum methods.

For the method insert, you'll be given a pair of (string, integer). The 
string represents the key and the integer represents the value. If the 
key already existed, then the original key-value pair will be overridden
to the new one.

For the method sum, you'll be given a string representing the prefix, and 
you need to return the sum of all the pairs' value whose key starts with 
the prefix.

Example 1: </br></br>
Input: insert("apple", 3), Output: Null</br>
Input: sum("ap"), Output: 3</br>
Input: insert("app", 2), Output: Null</br>
Input: sum("ap"), Output: 5</br>


