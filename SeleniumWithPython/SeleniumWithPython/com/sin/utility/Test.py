import pandas as pd
from mlxtend.frequent_patterns import apriori, association_rules
import rules
from mlxtend.preprocessing import TransactionEncoder
var = 1000
if var == 200:
    print ("1 - Got a true expression value")
    print (var)
elif var == 150:
    print ("2 - Got a true expression value")
    print (var)
elif var == 100:
    print ("3 - Got a true expression value")
    print (var)
else:
    print ("4 - Got a true expression value")
    print (var)

print ("Good bye!")

dataset = [
    ['vanilla wafers', 'bananas' , 'dog food'],
    ['bananas', 'bread', 'yogurt'],
    ['bananas','apples','yogurt'],
    ['vanilla wafers','bananas','whipped cream'],
    ['bread', 'vanilla wafers' , 'yogurt'],
    ['milk' 'bread' 'bananas'],
    ['vanilla wafers', 'apples' , 'bananas'],
    ['yogurt', 'apples', 'vanilla wafers'],
    
]

oht = TransactionEncoder()
oht_ary = oht.fit(dataset).transform(dataset)
df = pd.DataFrame(oht_ary, columns=oht.columns_)
print(df)


frequent_itemsets = apriori(df, min_support=0.2, use_colnames=True)
association_rule = association_rules(frequent_itemsets, metric="confidence", max_threshold=0.5)
print(frequent_itemsets)


rules["antecedant_len"] = rules["antecedants"].apply(lambda x: len(x))

rules[ (rules['antecedant_len'] >= 2) &
       (rules['confidence'] > 0.75) &
       (rules['lift'] > 1.2) ]

from mlxtend.preprocessing import OnehotTransactions

dataset = [
    ['vanilla wafers', 'bananas' , 'dog food'],
    ['bananas', 'bread', 'yogurt'],
    ['bananas','apples','yogurt'],
    ['vanilla wafers','bananas','whipped cream'],
    ['bread', 'vanilla wafers' , 'yogurt'],
    ['milk' 'bread' 'bananas'],
    ['vanilla wafers', 'apples' , 'bananas'],
    ['yogurt', 'apples', 'vanilla wafers'],
    
]

oht = OnehotTransactions()
oht_ary = oht.fit(dataset).transform(dataset)
df = pd.DataFrame(oht_ary, columns=oht.columns_)

frequent_itemsets = apriori(df, min_support=0.2, use_colnames=True)