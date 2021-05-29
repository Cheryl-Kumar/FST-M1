Fruits_dict = {
"apple" : 10,
"banana" : 40,
"cherry" : 90,
"mango" : 120,
}

Fruit_search = input("Please enter the fruit name you want to search for: ").lower()

if (Fruit_search in Fruits_dict):
        print("Your fruit is present in the dictionary!")
else:
    print("Your fruit is not present in the dictionary")