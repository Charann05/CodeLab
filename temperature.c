// This program converts a given temperature between Celsius and Fahrenheit.

#include<stdio.h>

int main(){
    int n;
    double temp;
    printf("---Temperature Convertor---\n");
    printf("1. C->F\n");
    printf("2. F->C\n");
    printf("Enter your choice : ");
    scanf("%d", &n);

    switch(n){
        case 1 : printf("Enter the temperature : ");
                 scanf("%lf", &temp);
                 temp = temp*(9.0/5.0)+32;
                 printf("F=%.2f", temp);
                 break;

        case 2 : printf("Enter the temperature : ");
                 temp;
                 scanf("%lf", &temp);
                 temp = (temp-32)*5.0/9.0;
                 printf("C=%.2f", temp);
                 break;

        default : printf("Invalid Choice!");
    }

    return 0;

}
