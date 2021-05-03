//1. Sigma
function sigma(num)
{
    var sum =0;
    for(var i=1; i<=num; i++)
    {
        sum += i;
    }
    return sum;
}

//2. Factorial
function factorial (num)
{
    var sum =1;
    for(var i=1; i<=num; i++)
    {
        sum *= i;
    }
    return sum;
}

//3. Fibonacci 
function fibonacci (num)
{
    var a = 0, b = 1, sum = 1;
    for(var i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
    }
    return sum;
}


//4. Array: Second-to-Last
function secondToLast (arr)
{
    if(arr.length<=1)
    {
        return null;
    }
    else 
    {
        return arr[arr.length-2];
    }
}

//5. Array: Nth-to-Last
function NthToLast (arr,num)
{
    if(arr.length<num)
    {
        return null;
    }
    else
    {
        return arr[arr.length-num];
    }
}

//6. Array: Second-Largest
function secondLargest (arr)
{
    if (arr.length<2)
    {
        return null;
    }
    else
    {
        arr.sort();
        return arr[arr.length -2];
    }
}

//7. Double Trouble
// by splice() method
var arr = [4,'ulysses',42,false];

arr.splice(1, 0, 4); 
arr.splice(3,0,'ulysses');
arr.splice(5,0, 42);
arr.splice(7,0,false);
console.log(arr)
