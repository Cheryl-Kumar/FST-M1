def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum = sum + int(number)
    return sum

# User input - list
numList = list(input("Enter a sequence of integers separated by Comma: ").split(','))

result = calculate_sum(numList)

print("The sum of all the elements is: " + str(result))
    
