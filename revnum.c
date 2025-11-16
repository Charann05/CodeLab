//This program reverses a given integer number.

#include<stdio.h>

int main(){
    int n;
    printf("Enter a number : ");
    scanf("%d",&n);
    int ans = 0;

    while(n>0){
        int rem = n%10;
        n /=10;
        ans = ans*10+rem;
    }
    printf("The reversed Integer value will be : %d",ans);

    return 0;
}