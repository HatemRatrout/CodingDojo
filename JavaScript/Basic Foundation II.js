//1. Biggie Size
function makeItBig(arr) {
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      arr[i] = "big";
    }
  }
  return arr;
}

//2. Print Low, Return High
function func(arr) {
  var min = arr[0];
  for (var i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
      min = arr[i];
    }
  }
  console.log(min);

  var max = arr[0];
  for (var i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

//3. Print One, Return Another
function func(arr) {
  console.log(arr[arr.length - 2]);
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 1) {
      return arr[i];
    }
  }
}

//4. Double Vision
function Double(arr) {
  var newArr = [];
  for (var i = 0; i < arr.length; i++) {
    newArr.push(arr[i] * 2);
  }
  return newArr;
}

//5. Count Positives
function CountPositives(arr) {
  var counter = 0;
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      counter++;
    }
  }
  arr[arr.length - 1] = counter;
  return arr;
}

//6. Evens and Odds
function CountPositives(arr) {
    var counter = 0;
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        counter++;
      }
    }
    arr[arr.length - 1] = counter;
    return arr;
  }
  
  //6. Evens and Odds
  function evensAndOdds(arr) 
  {
    var evenCounter = 0;
    var oddCounter = 0;
    for (var i = 0; i < arr.length; i++) 
    {
      if (arr[i] % 2 === 0) 
      {
        evenCounter++;
        oddCounter=0;
      }
      if (arr[i] % 2 === 1) 
      {
        oddCounter++;
        evenCounter=0;
      }
      if(evenCounter ==3)
      {
          console.log("Even more so!");
          evenCounter = 0;
      }
      if(oddCounter ==3)
      {
          console.log("That's odd!");
          oddCounter = 0;
      }
    }
  }


//7. Increment the Seconds
function Increment(arr) {
  for (var i = 0; i < arr.length; i++) {
    if (i % 2 == 1) {
      arr[i] = arr[i] + 1;
    }
  }
  for (var i = 0; i < arr.length; i++) {
    console.log(arr[i]);
  }
  return arr;
}

//8. Previous Lengths
function previousLengths(arr) {
  for (var i = arr.length - 1; i > 0; i--) {
    arr[i] = arr[i - 1].length;
  }
  return arr;
}

//9. Add Seven
function addSeven(arr) {
  var newArr = [];
  for (var i = 0; i < arr.length; i++) {
    newArr.push(arr[i] + 7);
  }
  return newArr;
}

//10. Reverse Array
function reverse(arr) {
  return arr.reverse();
}

//11. Outlook: Negative
function allNegative(arr) {
  var newArr = [];
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] < 0) {
      newArr.push(arr[i]);
    } else {
      newArr.push(arr[i] * -1);
    }
  }
}

//12. Always Hungry
function hungry(arr) {
  var counter = 0;
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] == "food") {
      console.log("yummy");
      counter++;
    }
  }
  if (counter == 0) {
    console.log("I'm hungry");
  }
}

//13. Swap Toward the Center
function swapTowardsTheCenter(arr) {
  var len = arr.length;
  var idx = 0;
  var lastIdx = arr.length - 1;
  while (idx <= len / 2 && lastIdx >= len / 2) {
    var temp = arr[idx];
    arr[idx] = arr[lastIdx];
    arr[lastIdx] = temp;
    idx = idx + 2;
    lastIdx = lastIdx - 2;
  }
  return arr;
}

//14.Scale the Array
function scaleArray(arr, num) {
  for (var i = 0; i < arr.length; i++) {
    arr[i] = arr[i] * num;
  }
  return arr;
}
