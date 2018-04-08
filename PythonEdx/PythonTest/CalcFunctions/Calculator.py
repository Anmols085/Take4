# -*- coding: utf-8 -*-
"""
Created on Wed Apr  4 16:35:35 2018

@author: Anmol
"""
import math
import logging
    
def add(x, y):
    '''
    Adds two numbers
    '''
    logging.info('addition initiated')
    return x + y

def subtract(x, y):
    '''
    subtracts the second number from first
    '''
    return x - y

def absSubtract(x, y):
    '''
    returns the difference between two number
    '''
    return abs(x-y)

def square(x):
    '''
    returns the square of a number
    '''
    return pow(x, 2)

def squareRoot(x):
    '''
    returns the square root of a number
    '''
    return math.sqrt(x)

def main(args):
    square(args)
    
if __name__ == '__main__':
    import sys
    main(sys.argv[1])