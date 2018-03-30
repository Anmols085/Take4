# -*- coding: utf-8 -*-
"""
Created on Thu Mar 29 15:06:28 2018

@author: Anmol
"""

def max_val(t): 
    """ t, tuple or list
        Each element of t is either an int, a tuple, or a list
        No tuple or list is empty
        Returns the maximum int in t or (recursively) in an element of t """ 
    # Your code here
    maximum = 0
    for element in t:
        if(type(element) is tuple):
            if(maximum<max_val(element)):
                maximum = max_val(element)
        elif(type(element) is list):
            if(maximum<max_val(element)):
                maximum = max_val(element)
        else:
            if(maximum<element):
                maximum = element
    return maximum

t = ((1,7), 2, 3)
print (max_val(t))