//This program displays the number of vowels and consonants in the given string.

#include<stdio.h>
#include<stdlib.h>

void count(char *s, int *v, int *c){

    for(int i=0;s[i]!='\0';i++){
        if(s[i]>='A' && s[i]<='Z')
            s[i] = s[i]+32;
        if(s[i]>='a' && s[i]<='z'){

            if(s[i]=='a' || s[i]=='e' || s[i]=='i' ||s[i]=='o' ||s[i]=='u'){
                (*v)++;
            }
            else{
                (*c)++;
            }
        }
    }
}

void main(){
    int n;
    char *s = (char*) malloc(n*sizeof(char));
    printf("Enter a String : \n");
    scanf("%[^\n]%*c", s);
    
    int v=0,c=0;
    count(s,&v,&c);
    printf("Number of Vowels are : %d and number of Consonants are : %d",v,c);

}
