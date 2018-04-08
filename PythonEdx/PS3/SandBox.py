import math

class Point:
    def __init__(self, x, y, z):
        self.x=x
        self.y=y
        self.z=z
    
    def __str__(self):
        return "point : ({}, {}, {}))".format(self.x, self.y, self.z)
    
    def distance(self, other):
        return math.sqrt((self.x-other.x)**2+(self.y-other.y)**2+(self.z-other.z)**2)

a = Point(1, 2, 3)
b = Point(0, 0, 0)
print(a)
print(a.distance(b))