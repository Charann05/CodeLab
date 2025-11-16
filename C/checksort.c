//This program checks if the given array is sorted or not.

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
    for(int i=0;i<n-1;i++){
        if(a[i]>a[i+1]){
            printf("Array is not sorted");
            return 0;
        }
    }
    printf("Array is sorted");
    free(a);
    return 0;

}
