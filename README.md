# Number Guessing Game

This is a simple Java console-based number guessing game. The program generates a random number between 0 and 100, and the user tries to guess the correct number within a specified number of rounds. Points are awarded for each correct guess, and penalties are applied for incorrect guesses.

## How to Play

1. **Compile the Code:**
    - Ensure you have a Java Development Kit (JDK) installed.
    - Open a terminal and navigate to the directory containing the `numberGame.java` file.
    - Compile the code using the command: `javac numberGame.java`

2. **Run the Game:**
    - Run the compiled program with the command: `java numberGame`
    - Follow the on-screen instructions to input the number of rounds and make guesses.

3. **Game Rules:**
    - The program will randomly select a natural number between 0 and 100.
    - You will have a specified number of rounds to guess the correct number.
    - Each correct guess earns you a point, while incorrect guesses result in a deduction of 0.5 points.
    - The game will display your points at the end of each round and the total points at the end of the game.

4. **Winning:**
    - Try to maximize your points by making accurate guesses.

## Code Structure

The code is organized into a single Java class (`numberGame`). Here's a brief overview:

- `main`: Entry point of the program, where the game is initialized and played.
- `playGame`: Method for the game loop, handling user input and evaluating guesses.
- `getUserGuess`: Method for obtaining user input for guesses.

## Improvements and Modifications

Feel free to modify and enhance the code to suit your preferences or add additional features. Consider breaking down the code into smaller methods, improving user input validation, or implementing a more sophisticated scoring system.

## Author

This number guessing game was created by [Your Name].

Enjoy the game!
