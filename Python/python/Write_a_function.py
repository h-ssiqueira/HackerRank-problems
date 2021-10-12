def is_leap(year):
    # Write your logic here
    if year % 4 == 0:
        if year % 100 == 0 and year % 400 == 0:
            return True
        if year % 100 != 0:
            return True
    return False

year = int(input())
print(is_leap(year))