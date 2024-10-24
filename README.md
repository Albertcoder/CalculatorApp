CalculatorApp README
Overview
CalculatorApp is a simple JavaFX application designed to perform basic arithmetic operations: addition, subtraction, multiplication, and division. The application follows the Model-View-Controller (MVC) design pattern to ensure a clean separation of concerns.

Features
User-friendly GUI for intuitive interaction.
Supports basic arithmetic operations (+, -, *, /).
Handles division by zero and displays appropriate error messages.
Clear/reset functionality to start new calculations.
Table of Contents
Installation
Usage
Screenshots
Error Handling
Known Issues
Contributing
License
Installation
Clone the repository:
bash
Копировать код
git clone https://github.com/yourusername/CalculatorApp.git
Navigate to the project directory:
bash
Копировать код
cd CalculatorApp
Open the project in your IDE (e.g., IntelliJ IDEA, Eclipse).
Ensure you have JavaFX set up in your development environment.
Usage
Run the application:
In your IDE, locate the main class and run it.
Using the Calculator:
Enter numbers using the digit buttons (0-9).
Select an arithmetic operator (+, -, *, /).
Press the equals button (=) to perform the calculation.
If needed, use the "Clear" button to reset the calculator.
Screenshots
![Снимок экрана 2024-10-24 152332](https://github.com/user-attachments/assets/1b02f241-c771-4cdc-8b0a-9058c11c617c)
![Снимок экрана 2024-10-24 152939](https://github.com/user-attachments/assets/60a0ad79-6f17-45a4-804b-1ad14eb080c9)

Main interface of the CalculatorApp.


Example of division by zero error message.

Error Handling
Division by Zero: If the user attempts to divide by zero, the calculator will display "Error: Division by Zero" in the input field.
General Input Handling: The application is designed to handle invalid inputs gracefully.
Known Issues
The calculator does not currently support decimal inputs; only integer arithmetic is implemented.
The application may not handle simultaneous operator presses; ensure to press the equals button after selecting an operator.
Contributing
Contributions are welcome! If you find a bug or have suggestions for improvements, please open an issue or submit a pull request.

License
This project is licensed under the MIT License. See the LICENSE file for details.

