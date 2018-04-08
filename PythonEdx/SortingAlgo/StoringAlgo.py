# -*- coding: utf-8 -*-
"""
Created on Sat Mar 31 11:32:50 2018

@author: Anmol
"""

l = [2,4,3,1,5,2,7,6,10,0]

# bubble sort
print("Bubble sort")
for j in range(len(l)-1):
    for i in range(len(l)-1):
        if l[i] > l[i+1]:
            l[i+1], l[i] = l[i], l[i+1]
    print(l)

l = [2,4,3,1,5,2,7,6,10,0]
print("Selection sort")
# selection sort
for i in range(len(l)-1):
    minimum = l[i]
    for j in range(i, len(l)):
        if minimum>l[j]:
            l[j], l[i] = l[i], l[j]
    print(l)

l = [2,4,3,1,5,2,7,6,10,0]
print("Merge sort")
#Merge function
def merge_sort(l):
    if(len(l)<2):
        return l
    else:
        middle = len(l)//2
        left = merge_sort(l[:middle])
        right = merge_sort(l[middle:])
        return merge(left, right)
    
def merge(left, right):
    result =[]
    i, j = 0,0
    while i<len(left) and j<len(right):
        if left[i]<right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    while i<len(left):
        result.append(left[i])
        i += 1
    while j<len(right):
        result.append(right[j])
        j += 1
    print(result)
    return result

merge_sort(l)