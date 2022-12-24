# Daily_Practice



import pandas as pd
import numpy as np
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split

ds=pd.read_csv('/content/sample_data/california_housing_test.csv')
ds.head()
varl=ds.var()

X=ds[["median_house_value","total_rooms","median_income"]]
Y=ds[["total_bedrooms","households"]]

X_train,X_test,Y_train,Y_test=train_test_split(X,Y,test_size=0.25,random_state=42)
regr=LinearRegression()
regr.fit(X_train,Y_train)
print(regr.score(X_test,Y_test))
