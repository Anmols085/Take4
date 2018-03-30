# -*- coding: utf-8 -*-
"""
Created on Thu Mar 29 14:40:45 2018

@author: Anmol
"""

def getSublists(L, n):
    
    s = []
    i = 0
    for t in range(len(L)):
        if((t+n)<=len(L)):
            i += 1
            s.append([])
            for x in range (n):
                s[i-1].append(L[t+x])
    return s

print(getSublists([1, 2, 3, 4], 2))