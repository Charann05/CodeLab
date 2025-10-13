//This program coverts the given decimal value to binary.

#include<stdio.h>

int main()
{
    int a;
    long int bin=0,m=1;
    printf("Enter the number :");
    scanf("%d", &a);
    while(a>0){
        bin = bin+(a%2)*m;
        m = m*10;
        a = a/2;
    }
    printf("%d", bin);
}