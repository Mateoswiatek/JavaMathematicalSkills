# Calculator Challenge

This Java program implements a simple calculator challenge where users are prompted to solve random arithmetic problems. The user is required to provide the correct answer within a certain epsilon value, and the program measures their response time.
# How it Works

The program begins by prompting the user to input the number of tests, the epsilon value, and the maximum value for variables used in calculations. It then generates random arithmetic problems (addition, subtraction, multiplication, division, or modulo) using the specified maximum variable value.

Upon presenting the arithmetic problem to the user, the program calculates the expected result and measures the time taken to solve it. Users are prompted to input their answer, and if the absolute difference between their answer and the correct result exceeds the epsilon value, they are asked to retry until their answer is within the acceptable range.

# Usage
Users need to input the following parameters:
- Number of tests to run.
- Epsilon value, defining the acceptable range for answers.
- Maximum value for variables used in calculations.

# Note
- For division operations, if the second number generated is zero, it is replaced by 1 to prevent division by zero errors.
- The program measures the time taken by the user to solve each problem and displays it upon successful completion.

# Running the Program

Users can run this program on their local machines after compiling it. Upon execution, follow the prompts to engage in the calculator challenge and test your arithmetic skills!
Disclaimer

# Possible Code Extensions
## Adding More Operations
Extend the available operations beyond addition, subtraction, multiplication, division, and modulo. Exponential operations (^), square root, or other mathematical functions.

## User Levels
Implement different levels of difficulty for users. Introduce beginner, intermediate, and advanced levels. Each level might include more complex calculations or stricter epsilon ranges, catering to users with varying skills.

## User Statistics
Incorporate a statistics feature that tracks user performance. Record the number of correct answers, average response time, or accuracy rate. This addition would allow users to track their progress and encourage them to improve.

## Multiplayer Mode (Tryb wieloosobowy)
Create a multiplayer mode where multiple users can compete simultaneously. Implement a scoring system to rank participants based on correct answers and speed of response. This mode would introduce a competitive element, enhancing user engagement.
