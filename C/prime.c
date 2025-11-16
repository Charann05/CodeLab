//This program tells if the given number is Prime or Not Prime.

#include<stdio.h>
#include<math.h>

int main(){
    int n;
    printf("Enter a number : \n");
    scanf("%d", &n);

    if(n<=1){
        printf("%d is not Prime",n);
        return 0;
    }

    int flag = 0;

    for(int i=2;i<sqrt(n);i++){
        if(n%i==0){
            flag = 1;
            break;
        }
    }

    if(flag==0){
        printf("%d is Prime",n);
    }
    else{
        printf("%d is not Prime",n);
    }

    return 0;
}