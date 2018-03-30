# -*- coding: utf-8 -*-
"""
Created on Thu Mar 29 15:54:29 2018

@author: Anmol
"""

def dict_invert(d):
    '''
    d: dict
    Returns an inverted dictionary according to the instructions above
    '''
    # Your code here
    tempList = []
    s=[]
    newDict = {}
    print(d)
    for key in d:
        tempList.append(key)
    
    
    
    for key in tempList:
        if(d[key] in newDict):
            s = newDict[d[key]]
            s.append(key)
        else:
            s=[]
            s.append(key)
        s.sort()
        newDict[d[key]]=s
        
    return newDict

d = {30000: 30, 600: 30, 2: 10}
print(dict_invert(d))