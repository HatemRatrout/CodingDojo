//1. Get 1 to 255
function all_numbers()
{
    var arr=[];
    for(var i=1; i<=255; i++)
    {
        arr.push(i);
    }
    return arr;
}


//2. Get even 1000
function odd ()
{
    for(var i=1; i<=1000; i++)
    {
        if(i%2==0)
        console.log(i);
    }
}


//3. Sum odd 5000
function Sum_odd()
{
    var sum=0;
    for(var i=1; i<=5000; i++)
    {
        if(i%2==1)
        {
            sum+=i;
        }
    }
    return sum;
}

//4. Iterate an array
function Sum (arr)
{
    var sum=0;
    for (var i=0; i<arr.length; i++)
    {
        sum+=arr[i];
    }
    return sum;
}


//5. Find max
function Max(arr)
{
    var max=arr[0];
    for(var i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
}


//6. Find average
function Average(arr)
{
    var sum=0;
    var avg=0;
    for(var i=0; i<arr.length; i++)
    {
        sum+=arr[i];
    }
    avg = sum / arr.length;
    return avg;
}


//7. Array odd
function odd_array()
{
    var arr=[];
    for(var i=1; i<=50; i++)
    {
        if(i%2==1)
        {
            arr.push(i);
        }
    }
    return arr;
}


//8. Greater than Y 
function greater_than (arr,y)
{
    var counter=0;
    for (var i=0; i<arr.length; i++)
    {
        if(arr[i]>y)
        {
            counter++;
        }
    }
    return counter;
}


//9. Squares 
function Squares (arr)
{
    for(var i=0; i<arr.length; i++)
    {
        arr[i] = arr[i] * arr[i];
    }
    return arr;
}


//10. Negatives 
function Negatives (arr)
{
    for(var i=0; i<arr.length; i++)
    {
        if(arr[i]<0)
        {
            arr[i]=0;
        }
    }
    return arr;
}


//11. Max/Min/Avg 
function Operations (arr)
{
    var max=arr[0];
    for(var i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

    var min=arr[0];
    for(var i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
    
    var sum=0;
    var avg=0;
    for(var i=0; i<arr.length; i++)
    {
        sum+=arr[i];
    }
    avg = sum / arr.length;

    arr[0] = max;
    arr[1] = min;
    arr[2] = avg;

    while(arr.length>3)
    {
        arr.pop();
    }
    return arr;
}


//12. Swap Values
function Swap (arr)
{
    var temp = arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1] = temp;
    return arr;
}


//13. Number to String
function toString (arr)
{
    for (var i=0; i<arr.length; i++)
    {
        if(arr[i]<0)
        {
            arr[i]='Dojo';
        }
    }
    return arr;
}

