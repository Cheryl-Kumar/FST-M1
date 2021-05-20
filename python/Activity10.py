UserEntry = tuple(input("Please enter a list of numbers separated by a comma: ").split(","))
print(UserEntry)

for num in UserEntry:
    num = int(num)
    if num % 5 == 0:
            print (num)
