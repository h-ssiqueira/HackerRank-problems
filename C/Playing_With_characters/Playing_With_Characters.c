#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LEN 100

int main(){
    char ch, s[MAX_LEN], sen[MAX_LEN];
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    scanf("%c%s\n%[^\n]%*c",&ch,s,sen);
    printf("%c\n%s\n%s",ch,s,sen);
    return 0;
}
