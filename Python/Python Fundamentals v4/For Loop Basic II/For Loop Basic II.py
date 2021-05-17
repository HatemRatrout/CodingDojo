#1. Biggie Size
def Biggie_Size (list):
    for i in range (0,len(list),1):
        if list[i]>0:
            list[i]="big"
    return list


#2. Count Positives
def Count_Positives(list):
    count = 0
    for i in range(0,len(list),1):
        if list[i]>0:
            count+=1
    list[len(list)-1] = count
    return list


#3. Sum Total
def Sum_Total(list):
    sum = 0
    for i in range (0, len(list),1):
        sum += list[i]
    return sum    


#4. Average
def Average(list):
    sum =0 
    for i in range (0, len(list),1):
        sum += list[i]
    avg = sum / len(list)
    return avg

#5. Length
def Length(list):
    return len(list) 


#6. Minimum
def Minimum(list):
    if(len(list)<1):
        return False
    min = list[0]
    for i in range (1,len(list),1):
        if list[i] < min:
            min = list[i]
    return min


#7. Maximum
def Maximum(list):
    if(len(list)<1):
        return False
    max = list[0]
    for i in range (1,len(list),1):
        if list[i] > max:
            max = list[i]
    return max


#8. Ultimate Analysis
def Ultimate_Analysis(list):
    dict = {}
    dict['sumTotal'] = Sum_Total(list)
    dict['average'] = Average(list)
    dict['minimum'] = Minimum(list)
    dict['maximum'] = Maximum(list)
    dict['length'] = Length(list)
    return dict


#9. Reverse List
def Reverse_List(list):
    list.reverse()
    return list
