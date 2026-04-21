import pandas as pd

data = pd.read_csv("dataset.csv")
print(data)

def find_s_algorithm(data):
    attribute = data.iloc[:,:-1].values
    target = data.iloc[:,-1].values

    for i in range(len(target)):
        if target[i] == "Y":
            hypothesis = attribute[i].copy()
            break

    for i in range(len(target)):
        if target[i] == "Y":
            for j in range(len(hypothesis)):
                if hypothesis[j] != attribute[i][j]:
                    hypothesis[j] = "?"

    return hypothesis

final_hypothesis = find_s_algorithm(data)
print("The Final Hypothesis is : ", final_hypothesis)