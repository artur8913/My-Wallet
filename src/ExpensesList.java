import java.util.ArrayList;
import java.util.List;

public class ExpensesList {

    static List<Expense> expensesList = new ArrayList<Expense>();

    static void addExpense(Expense newExpense) {

        expensesList.add(newExpense);

        System.out.println("Dodano nowy wydatek");
    }

    static void printExpenses(){

        for (int i = 0; i < expensesList.size(); i++) {
            System.out.print(i + 1 + "  ");
            Expense expense = expensesList.get(i);
            expense.print();
            System.out.println();
        }
    }
}
