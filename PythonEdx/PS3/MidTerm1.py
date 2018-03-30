# -*- coding: utf-8 -*-
"""
Created on Thu Mar 29 13:52:55 2018

@author: Anmol
"""

def actualCount(N):
    '''
    N: a non-negative integer
    '''
    # Your code here
    s = ''
    s = count7(N)
    return s.count('7')

def count7(N):
    s = ''
    if(N//10 == 0):
        if(N%10 == 7):
            return 1
        else:
            return 0
    else :
        if(N%10 == 7):
            return 1 + count7(N//10)
        else :
            return 0 + count7(N//10)