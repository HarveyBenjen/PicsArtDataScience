/*
    Homework #2
    Harvey Bejanyan
*/

// Problem 1
def fact(n: Int): Int = {
   var num = n
   var fact = num
   num = num - 1
   if (n == 0) {
      return 1
   }
   else {
      while (num > 0) {
         fact =  fact * num
         num = num - 1
      }
      return fact
   }
}

// Problem 2
def recursiveSum(n: Int): Int = {
   if (n == 0) {
      return 0
   }
   else {
      return (n + recursiveSum(n-1))
   }
}

// Problem 3
def convertToCurrency(arr: Array[Int]): Array[Any] {
   
}

// Problem 4


// Problem 5


// Problem 6


// Problem 7


// Problem 8


// Problem 9


// Problem 10


// Problem 11


// Problem 12


