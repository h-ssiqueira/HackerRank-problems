# Enter your code here. Read input from STDIN. Print output to STDOUT

import re

n = int(input())

ipv4 = '^((2[0-5]{2}|1[0-9]{2}|[0-9]{1,2})\.){3}(2[0-5]{2}|1[0-9]{2}|[0-9]{1,2}){1}$'
ipv6 = '^([0-9abcdef]{1,4}:){7}[0-9abcdef]{1,4}$'

for i in range(n):
    line = input()
    if re.match(ipv4,line):
        print('IPv4')
    elif re.match(ipv6,line):
        print('IPv6')
    else:
        print('Neither')
