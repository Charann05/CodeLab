//This program calculates the distance between two points in 2D space.

#include<stdio.h>
#include<math.h>

int main(){
    int x1,x2,y1,y2;

    printf("Enter x1 :");
    scanf("%d",&x1);
    printf("Enter y1 :");
    scanf("%d",&y1);
    printf("Enter x2 :");
    scanf("%d",&x2);
    printf("Enter y2 :");
    scanf("%d",&y2);

    double dist = sqrt(pow(x2-x1,2)+pow(y2-y1,2));
    printf("The distance between the coordinates : %.2lf",dist);

    return 0;
}