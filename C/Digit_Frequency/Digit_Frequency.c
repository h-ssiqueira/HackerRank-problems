#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int nums[10]={0,0,0,0,0,0,0,0,0,0};
    char string[1000];
    scanf("%s",string);
    for(int i = 0; i < strlen(string);i++){
        switch(string[i]){
            case '0': nums[0]++;
                    break;
            case '1': nums[1]++;
                    break;
            case '2': nums[2]++;
                    break;
            case '3': nums[3]++;
                    break;
            case '4': nums[4]++;
                    break;
            case '5': nums[5]++;
                    break;
            case '6': nums[6]++;
                    break;
            case '7': nums[7]++;
                    break;
            case '8': nums[8]++;
                    break;
            case '9': nums[9]++;
                    break;
        }
    }
    for(int i = 0;i<10;i++)
        printf("%d ",nums[i]);
    return 0;
}
