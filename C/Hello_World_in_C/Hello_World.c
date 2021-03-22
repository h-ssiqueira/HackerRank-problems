#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(){

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char s[100];
    scanf("%[^\n]%*c", s);

    printf("Hello, World!\n%s", s);
    return 0;
}
