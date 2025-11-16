//This program reverses the given array.

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n;
    int *a = (int*)malloc(n*sizeof(int));
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the array elements:\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    int left=0 , right=n-1, temp;
    while(left<right){
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
        left++;
        right--;

    }
    for(int i=0;i<n;i++){
        printf("%d ", a[i]);
    }
    free(a);
    return 0;
}

