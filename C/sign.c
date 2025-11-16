//This program tells if the given number is Positive, Negative or Zero.

#include<stdio.h>
void check(int n);

void main(){
    int n;
    printf("Enter a number :\n");
    scanf("%d",&n);
    check(n);
}

void check(int n){

    if(n==0){
        printf("The number is a Zero");
    }
    else if(n>0){
        printf("The number %d is Positive",n);
    }
    else{
        printf("The number %d is Negative",n);
    }
}