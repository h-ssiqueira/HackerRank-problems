#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function
    int x =*a, y=*b, z;
    *a = x+y;
    z = x-y;
    if(z < 0)
        z *= -1;
    *b = z;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
