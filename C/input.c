//This program reads a full sentence (including spaces) and displays it.

#include<stdio.h>

int main() 
{

    char arr[50];
    printf("Enter a Sentence :\n");
    scanf("%[^\n]%*c", arr);
    printf("You entered: %s\n", arr);
    
    return 0;
}
