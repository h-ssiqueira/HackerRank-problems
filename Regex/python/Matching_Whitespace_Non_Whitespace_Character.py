Regex_Pattern = r"([^\s]{2}\s){2}[^\s]{2}"	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())