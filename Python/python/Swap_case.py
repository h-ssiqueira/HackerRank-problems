def swap_case(s):
    string = ""
    for i in s:
        if i >= 'a' and i <= 'z':
            i = i.upper()
        elif i >= 'A' and i <= 'Z':
            i = i.lower()
        string += i
    return string

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)