//This program calculates the sum of the digits.

#include<stdio.h>
int sum(int n);

int main()
{
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    printf("Sum of the digits is : %d",sum(n));
    return 0;
}
int sum(int n){
    if(n>=0 && n<10)
        return n;
    else{
        return n%10+sum(n/10);
    }
}