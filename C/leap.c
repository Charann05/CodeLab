//This program tells if the given year is a Leap year or not.

#include<stdio.h>

void main(){
    int y;
    printf("Enter a year : ");
    scanf("%d", &y);

    if(y%400==0){
        printf("%d is a Leap Year",y);
    }
    else if(y%100==0){
        printf("%d is not a Leap Year",y);
    }
    else if(y%4==0){
        printf("%d is a Leap Year",y);
    }
    else{
        printf("%d is not a LEap Year",y);
    }
}