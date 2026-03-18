import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

from sklearn.datasets import fetch_california_housing

data = fetch_california_housing()
df = pd.DataFrame(data.data, columns=data.feature_names)

#plt.figure(figsize=(12,10))
df.hist(bins=30, figsize=(12,10), layout=(4,2), edgecolor='black')
plt.suptitle("Histogram for Numerical Features", fontsize=16)
plt.tight_layout()
plt.show()

plt.figure(figsize=(12,10))

for i, column in enumerate(df.columns, 1):
    plt.subplot(4,2,i)
    sns.boxplot(y=df[column])
    plt.title(f"Box Plot of {column}")

plt.tight_layout()
plt.show()

outliers = {}

for column in df.columns:
    Q1 = df[column].quantile(0.25)
    Q3 = df[column].quantile(0.75)
    IQR = Q3 - Q1

    lowerBound = Q1 - 1.5 * IQR
    upperBound = Q3 + 1.5 * IQR

    outliers[column] = df[(df[column]<lowerBound) | (df[column]>upperBound)][column].count()

print("Outliers count per feature")

for feature, count in outliers.items():
    print(f"{feature} : {count} outliers")
