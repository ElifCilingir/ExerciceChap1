package Exercice3;

public class CalculException extends Exception {
    public CalculException() {
        System.out.println("Vous essayez d'additionner des lettres! ");
    }
}
