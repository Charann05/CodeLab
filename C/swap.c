//This program swaps two integers without using a temporary variable.

#include<stdio.h>

int main(){
    int a ,b;
    printf("Enter two numbers :\n");
    scanf("%d%d",&a,&b);

    printf("Value of 'a' and 'b' before swap is,\n");
    printf("a=%d , b=%d",a,b);

    a = a+b;
    b = a-b;
    a = a-b;

    printf("\nValue of 'a' and 'b' after swap is,\n");
    printf("a=%d , b=%d",a,b);

    return 0;
}