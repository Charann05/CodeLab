//This program counts the number of occurrences of a digit in a given number.

#include<stdio.h>

int main(){
    int n,occur;
    printf("Enter a number :\n");
    scanf("%d",&n);
    printf("Enter the digit to check its occurrence :\n");
    scanf("%d",&occur);

    int count = 0;
    int temp = n;

    while(n>0){
        int rem = n%10;
        if(rem == occur){
            count++;
        }
        n /= 10;
    }
    printf("In the number %d :\n",temp);
    printf("The digit %d appears %d time(s).", occur,count);

    return 0;
}