package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        Boolean showExecutionLog = true;

        System.out.println("\nExecution result:\n");
        System.out.println("\nSymmetric time count: " + Exercise.Calculate(showExecutionLog));
    }
}