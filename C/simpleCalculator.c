//A simple calculator program that performs addition, subtraction, multiplication, division, and modulus on double values.

#include<stdio.h>
#include<math.h>

int main(){

    double a,b;
    char op;

    printf("============================================\n");
    printf("           SIMPLE CALCULATOR\n");
    printf("============================================\n");

    printf("Enter an expression : ");
    scanf("%lf%c%lf", &a,&op,&b);

    switch(op){

        case '+' : 
                    printf("Sum : %lf",a+b);
                    break;

        case '-' :
                    printf("Difference : %lf",a-b);
                    break;

        case '*' : 
                    printf("Product : %lf",a*b);
                    break;

        case '/' : 
                    if(b==0){
                        printf("Error : Division by zero is not allowed");
                    }
                    else{
                        printf("Quotient : %lf",a/b);
                    }
                    break;

        case '%' :
                    if(b==0){
                        printf("Error : Modulus by zero is not allowed");
                    }
                    else{
                        printf("Remainder : %lf",fmod(a,b));
                    }
                    break;
            
        default : printf("Invalid Input!");
    }
    return 0;
}