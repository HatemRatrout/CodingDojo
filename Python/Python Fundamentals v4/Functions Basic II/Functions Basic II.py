#1. Countdown 
def countdown(num):
    list=[]
    for i in range(num,-1,-1):
        list.append(i)
    return list


#2. Print and Return
def print_and_return(list):    
    if len(list)==2:
        print(list[0])
        return list[1]
    else:
        print("Length of the list should be 2 ..")


#3. First Plus Length
def first_plus_length(list):
    return list[0] + len(list)


#4. Values Greater than Second
def greater_than_second(list):
    newList=[]
    count=0
    if len(list)<2:
        return False
    else:
       for i in range(0,len(list)):
            if list[i]>list[1]:
                newList.append(list[i])
                count=count+1
                
    print(count)   
    return newList
            

#5. This Length, That Value
def length_of_values(size,value):
    list=[]
    for i in range(0,size,1):
        list.append(value)
    
    return list
