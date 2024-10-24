CalculatorApp README
Overview
CalculatorApp is a JavaFX-based calculator that performs basic arithmetic operations such as addition, subtraction, multiplication, and division. The application is built using the Model-View-Controller (MVC) design pattern for a clean and organized structure.

Table of Contents
Running the Application
Using the Calculator
Screenshots
Known Issues
Error Handling
Running the Application
Clone the repository:

bash
Копировать код
git clone https://github.com/yourusername/CalculatorApp.git
Navigate to the project directory:

bash
Копировать код
cd CalculatorApp
Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).

Set up JavaFX:

Ensure that you have the JavaFX SDK installed and configured in your IDE.
Add the JavaFX library to your project's dependencies.
Run the application:

Locate the main class (e.g., Main.java) and run it.
Using the Calculator
Entering Numbers:

Click on the digit buttons (0-9) to input numbers.
Performing Calculations:

Select an arithmetic operator (+, -, *, /) by clicking the corresponding button.
After entering the first number and selecting an operator, enter the second number.
Getting the Result:

Click the equals button (=) to calculate and display the result in the text field.
Clearing the Input:

Use the "Clear" button to reset the calculator and start a new calculation.
Screenshots
Main Interface

The main interface of CalculatorApp, showcasing the layout of buttons and display.

Performing Addition

Example of adding two numbers.

Handling Division by Zero

Error message displayed when attempting to divide by zero.
![Снимок экрана 2024-10-24 152332](https://github.com/user-attachments/assets/9f2620d8-fea5-42a5-b62d-02f2a7ecf0f6)
![Снимок экрана 2024-10-24 152939](https://github.com/user-attachments/assets/5b8b1de8-0c8c-4a3e-9b15-2f2346014c8c)

Known Issues
Decimal Support: The calculator currently only supports integer arithmetic. Decimal inputs are not yet implemented.
Operator Press Handling: Pressing multiple operators in quick succession may not yield expected results. Always press equals (=) after selecting an operator.
Error Handling
Division by Zero: The application gracefully handles division by zero by displaying the message "Error: Division by Zero" in the input field.
Invalid Input: Users are encouraged to enter valid integers and operators to ensure proper functionality.
