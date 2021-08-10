#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int max_of_four(int a, int b, int c, int d){
	if(a > b && a > c && a > d)
		return a;
	else if(b > a && b > c && b > d)
		return b;
	else if(c > a && c > b && c > d)
		return c;
	else
		return d;
}

int main(){
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    printf("%d", max_of_four(a, b, c, d));
    return 0;
}
