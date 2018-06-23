import pandas as pd

data = [{'a': 1, 'b': 2}, {'a': 5, 'b': 10, 'c': 20}]
df = pd.DataFrame(data)


data = [{'a': 1, 'b': 2}, {'a': 5, 'b': 10, 'c': 20}]
df = pd.DataFrame(data, columns=['a', 'b'])
s = pd.Series([89.2, 76.4, 98.2, 75.9], index=list('abcd'))
print(s[['c', 'a']])
print(df)

df = pd.DataFrame({'A':[34, 78, 54], 'B':[12, 67, 43]}, index=['r1', 'r2', 'r3'])
print(df)
df.loc['r4'] = [67, 78]
print(df)
print(df.loc['r2':'r3'])