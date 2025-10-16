// This is a "HackerRank" problem focused on bitwise operations.

#include <stdio.h>

void calculate_the_maximum(int n, int k) {
    int s[n];
    int a,b,c,maxa=0,maxb=0,maxc=0;
    for(int i=1;i<n;i++){
        for(int j=i+1;j<=n;j++){
            a = i&j;
            b = i|j;
            c = i^j;
            if(a<k && a>maxa){
                maxa = a;
            }
            if(b<k && b>maxb){
                maxb = b;
            }
            if(c<k && c>maxc){
                maxc = c;
            }
        }
    }
    printf("%d\n%d\n%d",maxa,maxb,maxc);
}

int main() {
    int n, k;
    printf("Enter the value for n and k :\n");
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}

