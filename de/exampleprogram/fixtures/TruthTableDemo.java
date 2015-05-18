package de.exampleprogram.fixtures;

public class TruthTableDemo {
    private int operand1;
    private int operand2;

    public int multiply() {
      return operand1*operand2;
    }

    public int divide() {
      return operand1/operand2;
    }

    public int subtract() {
      return operand1-operand2;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}