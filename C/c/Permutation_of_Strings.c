#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void exchange(char *a, char *b){
	char *temp = a;
	a = b;
	b = temp;
}

int next_permutation(int n, char **s)
{
	/**
	* Complete this method
	* Return 0 when there is no next permutation and 1 otherwise
	* Modify array s to its next permutation
	*/
/*
	1 (2 3 4 5)
	2 (3 4 5)
	3 (4 5)
	4 (5)
*/

	if(strcmp(s[n-1],s[n]) < 0){
		exchange(s[n-1],s[n]);
		return 1;
	}
}

int main()
{
	char **s;
	int n;
	scanf("%d", &n);
	s = calloc(n, sizeof(char*));
	for (int i = 0; i < n; i++)
	{
		s[i] = calloc(11, sizeof(char));
		scanf("%s", s[i]);
	}
	do
	{
		for (int i = 0; i < n; i++)
			printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
	} while (next_permutation(n, s));
	for (int i = 0; i < n; i++)
		free(s[i]);
	free(s);
	return 0;
}