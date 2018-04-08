# -*- coding: utf-8 -*-
"""
Created on Sat Mar 31 13:53:48 2018

@author: Anmol
"""
import pylab as plt

mySample = []
myLinear = []
myQuad = []
myCubic = []
myExp = []
for i in range(0, 30):
    mySample.append(i)
    myLinear.append(i)
    myQuad.append(i**2)
    myCubic.append(i**3)
    myExp.append(1.5**i)
plt.figure('len')
plt.title('Linear')
plt.xlabel("number")
plt.ylabel("value")
plt.plot(mySample, myLinear)
plt.figure('quad')
plt.plot(mySample, myQuad)
plt.figure('cubic')
plt.plot(mySample, myCubic)
plt.figure('exp')
plt.plot(mySample, myExp)