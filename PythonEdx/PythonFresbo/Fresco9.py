# -*- coding: utf-8 -*-
"""
Created on Wed Jun 20 23:50:20 2018

@author: Anmol
"""

from sklearn.cross_validation import train_test_split
from sklearn.datasets import make_classification

X, y = make_classification(n_samples=100, n_features=2,

                           n_informative=2, n_redundant=0,

                           n_clusters_per_class=1,

                           class_sep = 2.0, random_state=101)


X_train, X_test, y_train, y_test = train_test_split(X, y.astype(float),test_size=0.33, random_state=101)
from sklearn.linear_model import LogisticRegression



clf = LogisticRegression()

clf.fit(X_train, y_train.astype(int))

y_clf = clf.predict(X_test)


from sklearn.metrics import classification_report
print(classification_report(y_test, y_clf))