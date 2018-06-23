# -*- coding: utf-8 -*-
"""
Created on Wed Jun 20 23:33:45 2018

@author: Anmol
"""
from __future__ import print_function

import pandas as pd

import statsmodels.api as sm

import statsmodels.formula.api as smf

from sklearn.cross_validation import train_test_split


X_train, X_test, y_train, y_test = train_test_split(X, y.astype(float),test_size=0.33, random_state=101)

Scores = [(200,1),(100,0),(150,1),(320,1),(270,1),(134,0),(322,1),(140,0),(210,0),(199,0)]

Labels = ['Score','Win']

df = pd.DataFrame.from_records(Scores, columns=Labels)

glm_binom = sm.GLM(df.Win, df.Score, family=sm.families.Binomial())

res = glm_binom.fit()

print(res.summary())

from sklearn.datasets import make_classification

X, y = make_classification(n_samples=100, n_features=2,

                           n_informative=2, n_redundant=0,

                           n_clusters_per_class=1,

                           class_sep = 2.0, random_state=101)

print(X)
print(y)