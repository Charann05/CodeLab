//This program finds the length of an array using sizeof operator.

#include<stdio.h>

int main(){
    int a[] = {10,20,30,40,50,60};

    int array_length = sizeof(a)/sizeof(a[0]);
    printf("%d", array_length);
    return 0;

}
