while True:
    user1_answer = input("Player1, do you want to choose rock, paper or scissors? ").lower()
    user2_answer = input("Player2, do you want to choose rock, paper or scissors? ").lower()

# Run the algorithm to see who wins
    if user1_answer == user2_answer:
        print("It's a tie!")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_answer == 'scissors':
        if user2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    playAgain = input("Do you want to play again? Yes/No: ").lower()

    if (playAgain=="yes"):
        pass
    elif (playAgain=="no"):
        raise SystemExit
    else:
        print("Invalid input! Exiting..")
        raise SystemExit
