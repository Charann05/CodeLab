//This program generates the factorial of a given number (0-19).

#include<stdio.h>

int main(){
    int n , fact=1;
    printf("Enter a number : ");
    scanf("%d", &n);

    if(n<0){
        printf("Not Defined!");
    }

    else if(n>19){
        printf("Out of Range!");
    }

    else{
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        printf("The factorial of %d is %d",n,fact);
    }

    return 0;
}