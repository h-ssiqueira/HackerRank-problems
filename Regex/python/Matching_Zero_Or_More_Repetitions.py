Regex_Pattern = r'^\d\d+[a-z]*[A-Z]*$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())