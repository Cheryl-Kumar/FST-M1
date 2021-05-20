input1 = list(input("Please enter a sequence of numbers separated by a comma: ").split(","))
print(input1)

fisrtElement = input1[0]
lastElement = input1[-1]


if (fisrtElement == lastElement):
    print (True)
else:
    print(False) 
