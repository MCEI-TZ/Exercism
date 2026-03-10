class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String result = "";
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
        if (operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
        switch (operation) {
            case "+" -> result = String.format("%1$d + %2$d = %3$d", operand1, operand2, (operand1 + operand2));
            case "*" -> result = String.format("%1$d * %2$d = %3$d", operand1, operand2, (operand1 * operand2));
            case "/" -> {
                try {
                    result = String.format("%1$d / %2$d = %3$d", operand1, operand2, (operand1 / operand2));
                } catch (ArithmeticException ex) {
                    throw new IllegalOperationException("Division by zero is not allowed",ex);
                }
                ;
            }
            default -> {
                throw new IllegalOperationException("Operation \'" + operation + "\' does not exist");
            }
        }
        return result;
    }
}
