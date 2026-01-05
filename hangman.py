import random

word_list = ["apple", "chair", "bread", "house", "tiger", "phone", "river", "train",
    "laptop", "bicycle", "rainbow", "football", "village", "diamond",
    "monster", "holiday",
    "astronaut", "algorithm", "microscope", "encyclopedia",
    "electricity", "architecture", "cryptocurrency",
    "compiler", "database", "software", "hardware",
    "variable", "function", "internet", "protocol",
    "avengers", "batman", "matrix", "inception",
    "waterfall", "mountain", "hurricane", "volcano" ]
lives = 6
stage = ['''
  +---+
  |   |
      |
      |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
      |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
  |   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========''', '''
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========''']
chosen_word = random.choice(word_list)
print(chosen_word)


placeholder = ""
word_length = len(chosen_word)
for position in range (word_length):
    placeholder += "_"
print(placeholder)

game_over = False
correct_letters = []

while not game_over:
    guess = input("Guess a latter : ").lower()
    display = ""
    for letter in chosen_word:
        if letter == guess:
            display += letter
            correct_letters.append(guess)
        elif letter in correct_letters:
            display += letter
        else:
            display+="_"  
    print(display)   
    
    if guess not in chosen_word:
        lives -= 1
        if lives == 0:
            print("you lose")
    if "_" not in display:
        game_over = true
        print("you win")
    print(stage[lives])