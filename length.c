//This program gives us lenght of the string provided.

#include<stdio.h>

int length(char a[], int index);

int main()
{
    char a[100];
    printf("Enter a string: ");
    scanf("%s", &a);
    printf("%[^\n]%*c",a); //this format specifier is used to accept a string with spaces(string should be written in a single line)
    int m = length(a,0);
    printf("Length is: %d", m);
    return 0;

}

int length(char a[], int index)
{
    static int l=0;
    if(a[index]=='\0'){
        return l;
    }
    else{
        l++;
        length(a,index+1);
    }
}