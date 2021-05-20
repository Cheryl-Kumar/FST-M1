UserInput = list (input ("Please enter a list of numbers separated by a comma:").split(","))
print (UserInput) 
sum = 0  

for number in UserInput:
  sum += int(number)

print(sum)