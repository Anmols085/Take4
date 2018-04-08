# -*- coding: utf-8 -*-
"""
Created on Thu Apr  5 18:45:24 2018

@author: Anmol
"""
import math
class Point(object):
    
    def __init__(self, x, y, z):
        self.x = x
        self.z = z
        self.y = y
    
    def __str__(self):
        return 'Point({}, {}, {})'.format(self.x, self.y, self.z)
    
    def __add__(self, other):
        x = self.x+other.x
        y = self.y+other.y
        z = self.z+other.z
        return 'Point({}, {}, {})'.format(x, y, z)

    def distance(self, other):
        return math.sqrt(pow(self.x-other.x, 2)+pow(self.y-other.y, 2)+pow(self.z-other.z, 2))

x = Point(1, 2, 3)
y = Point(2, 3, 4)
print(x.distance(y))
print(x+y)