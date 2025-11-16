//This program calculates the hypotenuse of a right-angled triangle given the lengths of the other two sides.

#include<stdio.h>
#include<math.h>

int main(){
    int a,b;
    printf("Enter the length of side a and b : ");
    scanf("%d%d",&a,&b);

    double hypo = sqrt(pow(a,2)+pow(b,2));

    printf("Hypotenuse of Triangle : %.2lf",hypo);

    return 0;
}