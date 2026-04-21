import numpy as np 
import matplotlib.pyplot as plt
from collections import Counter

def generate_data():
    np.random.seed(42)
    x = np.random.rand(100)
    labels = np.array(['Class 1' if xi<=0.5 else 'Class 2' for xi in x[:50]])
    return x,labels

def knn_classify(train_x, train_y, test_x, k):
    predictions = []

    for test_points in test_x:
        distances = np.abs(train_x - test_points)
        nearest_indices = np.argsort(distances)[:k]

        nearest_labels = train_y[nearest_indices]
        most_common_Labels = Counter(nearest_labels).most_common(1)[0][0]

        predictions.append(most_common_Labels)
    return np.array(predictions)

def plot_result(x, train_x, train_y, predictions, k):
    plt.scatter(x[50:], [1.1]*len(predictions), c=['red' if label=='Class 1' else 'blue' for label in predictions], label='Test Predictions', marker='x')
    plt.axvline(0.5, color='gray', linestyle='--', label='Decision Boundary')

    plt.legend()
    plt.title(f'KNN classification for k value : {k}')
    plt.show()

x, labels = generate_data()

train_x, train_y = x[:50], labels
test_x = x[50:]

k_values = [1,2,3,4,5,20,30]

for k in k_values:
    predictions = knn_classify(train_x, train_y, test_x, k)
    plot_result(x, train_x, train_y, predictions, k)