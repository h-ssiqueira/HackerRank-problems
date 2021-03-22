#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;
void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    int t[n],j,i,min,pos,x,y,z,w;
    double p;
    for(i=0; i < n; i++){
        p = (tr[i].a + tr[i].b + tr[i].c)/2.0;
        t[i] =(p * (p-tr[i].a) * (p-tr[i].b) * (p-tr[i].c));
    }
    for(j = 0;j < n-1; j++){
        min=t[j];
        pos = j;
        for(i = j+1; i < n; i++){
            if(min > t[i]){
                pos = i;
                min = t[i];
            }
        }
        if(j != pos){
            x = tr[j].a;
            y = tr[j].b;
            z = tr[j].c;
            w = t[j];
            tr[j].a = tr[pos].a;
            tr[j].b = tr[pos].b;
            tr[j].c = tr[pos].c;
            t[j] = t[pos];
            tr[pos].a = x;
            tr[pos].b = y;
            tr[pos].c = z;
            t[pos] = w;
        }
    }
    /*for(i = 0, j = n-1; i<j;i++,j--){
        x = tr[j].a;
        y = tr[j].b;
        z = tr[j].c;
        w = t[j];
        tr[j].a = tr[i].a;
        tr[j].b = tr[i].b;
        tr[j].c = tr[i].c;
        t[j] = t[i];
        tr[i].a = x;
        tr[i].b = y;
        tr[i].c = z;
        t[i] = w;
    }*/
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}