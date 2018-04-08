import Calculator as calc

help(calc.add)
print(calc.add(3, 4))
help(calc.absSubtract)
print(calc.absSubtract(3, 4))
help(calc.square)
n = [1, 2, 3, 4, 5]
s = [calc.square(num) for num in n]
print(s)