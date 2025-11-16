//This program calculates the nth Fibonacci number using an iterative approach.

#include<stdio.h>

int main(){
    int n;
    printf("Enter the nth element :\n");
    scanf("%d",&n);

    if(n==0){
        printf("0th element is 0");
        return 0;
    }
    if(n==1){
        printf("1th element is 1");
        return 0;
    }

    int p = 0;
    int c = 1;

    for(int i=2;i<=n;i++){
        c +=p;
        p = c-p;
    }
    printf("%dth element is %d", n,c);

    return 0;
}