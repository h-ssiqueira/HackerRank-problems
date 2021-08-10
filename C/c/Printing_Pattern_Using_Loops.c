#include <stdio.h>

int main(){
    int n,counti = 0,countj;
    scanf("%d", &n);
      for(int i = 0; i < 2*n-1;i++){
            countj=0;
            for(int j = 0; j < 2*n-1;j++){
                    printf("%d ", counti < countj ? n-counti : n-countj);
                if(countj < n-1 && j < n)
                    countj++;
                else
                    countj--;
            }
            printf("\n");
            if(counti < n-1 && i < n)
                counti++;
            else
                counti--;
      }
    return 0;
}
