#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.
  int and=0,or=0,xor=0,i,j,aux;
  for(j=1;j<=k;j++){
    for(i = j+1; i<=n;i++){
        aux = i&j;
        if(aux < k && aux > and)
            and=aux;
        aux = i|j;
        if(aux < k && aux > or)
            or=aux;
        aux = i^j;
        if(aux < k && aux > xor)
            xor=aux;
    }
  }
  printf("%d\n%d\n%d",and,or,xor);
}

int main() {
    int n, k;

    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);

    return 0;
}
