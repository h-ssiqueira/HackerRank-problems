Regex_Pattern = r'^[1-3][0-2][sx0][30Aa][sux][.,]$'	# Do not delete 'r'.

import re

print(str(bool(re.search(Regex_Pattern, input()))).lower())