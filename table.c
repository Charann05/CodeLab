//This program generates the multiplication table of the given value.

#include<stdio.h>

void main(){
    int n,m;
    printf("Please enter the number to generate its multiplication table : ");
    scanf("%d" , &n);
    printf("Enter the range upto which the table should be displayed : ");
    scanf("%d", &m);
    printf("Generating the table of %d ...\n", n);
    for(int i=1;i<=m;i++){
        printf("%dx%d=%d\n", n,i,n*i);
    }
}