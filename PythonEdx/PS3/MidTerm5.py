# -*- coding: utf-8 -*-
"""
Created on Thu Mar 29 15:49:09 2018

@author: Anmol
"""

def satisfiesF(L):
    """
    Assumes L is a list of strings
    Assume function f is already defined for you and it maps a string to a Boolean
    Mutates L such that it contains all of the strings, s, originally in L such
            that f(s) returns True, and no other elements. Remaining elements in L
            should be in the same order.
    Returns the length of L after mutation
    """
    # Your function implementation here
    for c in L:
        if(f(c)==False):
            L.remove(c)
    return len(L)
    
def f(s):
    return 'a' in s
      
L = ['a', 'b', 'a']
print (satisfiesF(L))
print (L)
#run_satisfiesF(L, satisfiesF)