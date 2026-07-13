import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('LR.csv')
print(data)

def mean_XY(data):
    X_mean = 0
    Y_mean = 0

    for x,y in zip(data['Hours'], data['Score']):
        X_mean += x
        Y_mean += y
    
    Y_mean /= len(data.Score)
    X_mean /= len(data.Hours)
    return X_mean,Y_mean

    # print(X_mean)
    # print(Y_mean)

def div(data,X_mean,Y_mean):
    sum_div_pro = 0
    sq_div_X = 0
    sum_sq_div_X = 0

    for x,y in zip(data['Hours'], data['Score']):
        div_X = x-X_mean
        sq_div_X = div_X*div_X
        div_Y = y-Y_mean

        pro_div = div_X*div_Y
        sum_div_pro += pro_div
        sum_sq_div_X += sq_div_X

    return sum_div_pro,sum_sq_div_X

def slope_bias(sum_div_pro,sum_sq_div_X,X_mean,Y_mean):
    m = sum_div_pro / sum_sq_div_X
    b = Y_mean - (m*X_mean)

    Y_pred = []
    for x in data['Hours']:
        Y_pred.append(calculate_score(x,m,b))
    
    plt.plot(data['Hours'],Y_pred,label='Regression Line', color='black')
    return m,b

def calculate_score(X,m,b):
    Y = m*X + b
    return Y

X_mean,Y_mean = mean_XY(data)
sum_div_pro,sum_sq_div_X = div(data,X_mean,Y_mean)
m,b = slope_bias(sum_div_pro,sum_sq_div_X,X_mean,Y_mean)

X = int(input('Enter the number of hours a student studies : '))
Y = calculate_score(X,m,b)
Y = min(Y, 100)

print(f'Predicted Score : {Y:.2f}')
plt.scatter(data["Hours"], data["Score"], label="Actual Data")
plt.scatter(X,Y,color='red', label='Prediction')

plt.title('Linear Regression')
plt.xlabel('Hours Studied')
plt.ylabel('Score')
plt.legend()
plt.show()
