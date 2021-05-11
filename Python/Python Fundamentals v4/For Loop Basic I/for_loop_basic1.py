#1. Basic 
for i in range(0,151,1):
    print(i)

#2. Multiples of Five 
for i in range(5,1005,5):
    print(i)

#3. Counting, the Dojo Way
for i in range(1,101,1):
    if i%5 == 0:
        if i%10 == 0:
            i = "Coding Dojo"
        else:
            i = "Coding"
    print(i)

#4. Whoa. That Sucker's Huge
sum = 0
for i in range(1,500000,2):
    sum += i
print(sum)

#5. Countdown by Fours 
for i in range(2018,0,-4):
    print(i)

#6. Flexible Counter
lowNum = 2
highNum = 9
mult = 3
for num in range(lowNum, highNum + 1):
    if num % mult == 0:
        print(num)