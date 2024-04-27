Regex_Pattern = r'^[A-Za-z02468]{40}[\s13579]{5}$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())