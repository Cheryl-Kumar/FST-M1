list1 = [11, 7, 2, 8, 20]
list2 = [4, 9, 17, 5, 33]

thirdlist = []

for num in list1: 
    if num%2 != 0:
        thirdlist.append(num)

for num in list2:
    if num%2 != 0:
        thirdlist.append(num)

print ("The final list is :")
print (thirdlist)