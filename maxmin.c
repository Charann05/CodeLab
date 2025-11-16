//This program give us the greatest among two numbers without using relational operators.

#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a,b,max,min;
    printf("Enter two different numbers : ");
    scanf("%d%d", &a,&b);

    max = (a+b+abs(a-b))/2;
    min = (a+b-abs(a-b))/2;
    
    printf("The number %d is greater than %d\n", max, min);
    return 0;
}