//This program gives the count of each number in a given array.

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int n, count;
    int *a = (int*)malloc(n*sizeof(int));
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    printf("Enter the array elements:\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    int *visited=(int*)calloc(n,sizeof(int));
    for(int i=0;i<n;i++){
        
        if(visited[i]==0){
            count = 1;

            for(int j=i+1;j<n;j++){
                //count = 1;
                if(a[i]==a[j]){
                    count++;
                    visited[j]=1;
                }
            }
        printf("Element %d repeats %d times.\n", a[i], count);
        }
    }
    free(visited);
    free(a);
    return 0;

}

