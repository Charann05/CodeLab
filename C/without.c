#include<stdio.h>

int main()
{
    int a,b,sum,diff,multi;
    printf("Enter two numbers : ");
    scanf("%d%d", &a,&b);
    float c=a, d=b;

    sum = a-(-b);       //adding a and b without using '+' operator.
    diff = a+(~b)+1;    //subtracting a and b without using '-' operator.
    multi = c/(1/d);    //multiplyinng a and b without using '*' operator.

    printf("Sum : %d\nDifference : %d\nProduct : %d\n", sum,diff,multi);
    return 0;
}