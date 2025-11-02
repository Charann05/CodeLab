//This program prints first n natural numbers.

#include<stdio.h>

int main(){
    int n;
    printf("Enter the Range :\n");
    scanf("%d",&n);
    printf("---Printing first n natural numbers---\n");

    for(int i=1;i<=n;i++){
        printf("%d\n",i);
    } 

    return 0;
}