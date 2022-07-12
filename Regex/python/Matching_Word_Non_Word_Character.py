Regex_Pattern = r"\w{3}\W\w{3}\w{4}\w{3}\W\w{3}"	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())