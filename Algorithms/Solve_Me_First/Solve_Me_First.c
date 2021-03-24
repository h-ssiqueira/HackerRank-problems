#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int solveMeFirst(int a, int b) {
    // Hint: Type return a+b; below
    return b+a;

}

int main() {
    int num1,num2;
    scanf("%d %d",&num1,&num2);
    printf("%d",solveMeFirst(num1,num2));
    return 0;
}
