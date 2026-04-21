import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.datasets import fetch_california_housing

data = fetch_california_housing()
df = pd.DataFrame(data.data, columns=data.feature_names)
df['Target'] = data.target

variable_meaning = {
    'MedInc' : 'Median of income in block group',
    'HouseAge' : 'Median of house age in block group',
    'AveRooms' : 'Average number of rooms per house',
    'AveBedrms' : 'Average number of bedrooms per house',
    'Population' : 'Population of the block group',
    'AveOccup' : 'Average number of occupants per house',
    'Latitude' : 'Latitude of the block group',
    'Longitude' : 'Logitude of the block group',
    'Target' : 'Median house value (in $100,000s)'
}

variable_df = pd.DataFrame(list(variable_meaning.items()), columns=['Features', 'Description'])

print('Variable meaning table\n')
print(variable_df)

print('Basic information about the dataset\n')
print(df.info())

print('First five rows of the dataset\n')
print(df.head())

print('Summary Statistics\n')
print(df.describe())

print('Number of missing values : ')
print(df.isnull().sum())

plt.figure(figsize=(10,12))
df.hist(bins=30, figsize=(10,12), edgecolor='black')
plt.suptitle('Feature Distribution')
plt.show()

plt.figure(figsize=(10,12))
sns.boxplot(data=df)
plt.title('Boxplot to identify the outliers')
plt.show()

corr_matrix = df.corr()
sns.heatmap(corr_matrix, cmap='coolwarm', fmt='.2f', annot=True)
plt.title('Correlation heatmap')
plt.show()

sns.pairplot(df[['MedInc', 'HouseAge', 'AveRooms', 'Target']], diag_kind='kde')
plt.show()

print('Key Insights\n')
print('1. The dataset has ',df.shape[0],' rows and ',df.shape[1],' columns')
print('2. No missing values found in the dataset')
print('3. The histogram shows skewed distribution in some of the features like MedInc')
print('4. The boxplot shows potential outliers in the features like AveRooms and AveOccp')
print('5. The Correlation heatmap shows MedInc has the highest correlation with the house prices')