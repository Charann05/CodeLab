//This program replaces 0 by 1 in the given sequence.

#include<stdio.h>

char* re(char a[], int index);

int main()
{
    char a[100];
    printf("Enter the number:\n");
    scanf("%s", a);
    char* m = re(a,0);
    printf("%s", m);
    return 0;

}
char* re(char a[], int index)
{
    while(a[index]!='\0'){
    if(a[index]=='0')
    {
        a[index]='1';
    }
    else{
        return re(a,index+1);
    }
    }
    return a;
}