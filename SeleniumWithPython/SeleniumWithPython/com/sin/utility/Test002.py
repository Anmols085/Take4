'''
Created on 16-Jun-2018

@author: Anmol
'''
import numpy as np

import pandas as pd

customerArrival = pd.date_range('18/09/2017 8:00', periods=600, freq='T')

custArrivalTs = pd.Series(np.random.randint(0, 100, len(customerArrival)), index=customerArrival)

print(custArrivalTs.head(10))
pf = custArrivalTs.resample('10min')
print(pf)
