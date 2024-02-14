import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operationNumber = 0;

        while (operationNumber != 3) {

            System.out.println("      Menu glowne");
            System.out.println("---------------------------");
            System.out.println("1 - Dodaj nowy wydatek");
            System.out.println("2 - Pokaz liste wydadkow");
            System.out.println("3 - Zakoncz program");
            System.out.println("---------------------------");
            System.out.print("Co chesz zrobic: ");

            operationNumber = scanner.nextInt();

            switch (operationNumber) {

                case 1 -> {

                    ExpensesList.addExpense(Expense.read());
                }

                case 2 -> {

                    ExpensesList.printExpenses();
                }

                case 3 -> {

                    System.out.print("Koniec programu");
                }

                default -> {

                    System.out.println("Nieznane polecenie");
                }
            }
        }
    }
}