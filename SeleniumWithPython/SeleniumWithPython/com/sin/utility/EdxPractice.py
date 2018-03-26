print("Please think of a number between 0 and 100!")
number = 50
upperLimit = 100
lowerLimit = 0
guess = 'a'
print("Is your secret number "+str(number)+"?")
guess = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly.")
while True:

    if guess == 'h':
        
        upperLimit = number
        number = int(number - (number-lowerLimit)/2)
        print("Is your secret number "+str(number)+"?")
        
    elif guess == 'l':
        
        lowerLimit = number
        number = int(number + (upperLimit-number)/2)
        print("Is your secret number "+str(number)+"?")
        
    elif guess == 'c':
        
        break
    
    else: 
        print("Sorry, I did not understand your input.")
        print("Is your secret number "+str(number)+"?")
    
    guess = input("Enter 'h' to indicate the guess is too high. Enter 'l' to indicate the guess is too low. Enter 'c' to indicate I guessed correctly.")
    
print("Game over. Your secret number was: "+str(number))    