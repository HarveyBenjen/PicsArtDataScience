
def swap(a: Array[Int], i1: Int, i2: Int) = { 
    val tmp = a(i1) 
    a(i1) = a(i2)
    a(i2) = tmp 
}

def bubbleSort(arr: Array[Int]) = {
    var i = 0; var j = 0
    for(i <- 1 to arr.length-1){
        for(j <- (i-1) to 0 by -1){
            if(arr(j) > arr(j+1)){
              swap(arr, j, j+1)
            }
        }
    }
}

def selectionSort(arr: Array[Int]) = {
    var i = 0
    while(i < (arr.length - 1)) {
        var min = i; var j = i + 1
        while (j < arr.length) {
            if(arr(j) < arr(min)) {
                min = j
            }
            j += 1
        }
        swap(arr, i, min)
        i += 1
    }
}

def insertionSort(arr: Array[Int]) = {
    var i = 0; var j = 0
    for (i <- 1 to arr.length-1){
        j=i
        while(j > 0 && arr(j-1) > arr(j)){
            swap(arr, j, j-1)
            j -= 1
        }
    }
}

def mergeSort(arr: Array[Int]) = {
    
}

def quickSort(arr: Array[Int]) = {
    
}

val a = Array(10,4,3,8,6,9,11,15,13)
val b = Array(10,4,3,8,6,9,11,15,13)
val c = Array(10,4,3,8,6,9,11,15,13)
val d = Array(10,4,3,8,6,9,11,15,13)

bubbleSort(a)
selectionSort(b)
insertionSort(c)

