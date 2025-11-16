//This program counts the number of even and odd numbers in a given array.

#include<stdio.h>
#include<stdlib.h>

void numofevenandodd(int*a, int n){
    int e=0,o=0;

    for(int i=0;i<n;i++){
        if(a[i]%2==0){
            e++;
        }
        else{
            o++;
        }
    }

    printf("Number of Even numbers are : %d and Number of Odd numbers are : %d", e,o);
}

int main(){
    int n;
    printf("Enter the number of elements : \n");
    scanf("%d", &n);
    printf("Enter the elements : \n");

    int *a = (int*)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    numofevenandodd(a,n);
    free(a);
    return 0;
}