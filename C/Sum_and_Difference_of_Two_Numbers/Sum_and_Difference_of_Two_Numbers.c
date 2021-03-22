#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LEN 100

int main(){
    int x, y;
	float a, b;
	scanf("%d %d\n%f %f",&x,&y,&a,&b);
	printf("%d %d\n%.1f %.1f",x+y,x-y,a+b,a-b);
    return 0;
}
