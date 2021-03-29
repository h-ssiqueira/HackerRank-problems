#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int lexicographic_sort(const char* a, const char* b) {
    return strcmp(a,b);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return lexicographic_sort(b,a);
}

int different_letters(const char* a){
	int *letters = calloc(26,sizeof(int)),s = 0;
    for(int i = 0; a[i] != '\0'; i++)
        letters[a[i]-97]++;
    for(int i = 0; i < 26; i++)
        if(letters[i] > 0)
            s++;
    free(letters);
	return s;
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int s = different_letters(a) - different_letters(b);
    if(s)
		return s;
    return lexicographic_sort(a,b);
}

int sort_by_length(const char* a, const char* b) {
	int l = strlen(a) - strlen(b);
    if(l)
		return l;
	return lexicographic_sort(a,b);
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    int i,j /*= len-1*/;
    char *aux;
	for(i = 1; i < len; i++){
		aux = arr[i];
		for(j = i - 1; j >= 0 && cmp_func(aux,arr[j]) < 0; j--)
			arr[j+1] = arr[j];
		arr[j+1] = aux;
	}
    /*while(j > 1){
        for(i = 0; i < j; i++){
            if(cmp_func(arr[i],arr[i+1]) > 0){
                aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
            }
        }
        j--;
    }*/
}



int main()
{
    int n;
    scanf("%d", &n);

    char** arr;
	arr = (char**)malloc(n * sizeof(char*));

    for(int i = 0; i < n; i++){
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }

    string_sort(arr, n, lexicographic_sort);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");
}