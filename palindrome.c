//This program checks if the given word is a Palindrome.

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>

void palindrome(char s[]){
    int i=0,j=strlen(s)-1;
    //printf("%d", j);

    while(i<j){
        if(s[i]!=s[j]){
            printf("It is not a Palindrome");
            exit(0);
        }
        i++;
        j--;
    }

    printf("It is a Palindrome");
}

void main(){
    //int n;
    //char *s = (char*)malloc(n*sizeof(char));
    char s[10];
    printf("Enter a word : \n");
    scanf("%s", s);
    
    for(int i=0;s[i]!='\0';i++){
        s[i] = tolower(s[i]);
    }

    palindrome(s);
}