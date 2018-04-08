# -*- coding: utf-8 -*-
"""
Created on Thu Apr  5 20:41:52 2018

@author: Anmol
"""

import unittest

def isEven(x):
    if(x%2==0):
        return True
    return False

def suite():
    testEven = TestIsEvenMethod()
    testEven.test_isEven1()
    testEven.test_isEven2()
    testEven.test_isEven3()

class TestIsEvenMethod(unittest.TestCase):
    
    def test_isEven1(self):
        self.assertAlmostEqual(isEven(5), False, 'Did not work')
        print("Test Passed")
        
    def test_isEven2(self):
        self.assertEqual(isEven(10), True, 'Did not work')
        print("Test Passed")
    
    def test_isEven3(self):
        self.assertRaises(TypeError, isEven('hello'))
        print("Test Passed")
        
if __name__ == '__main__':
    unittest.main()