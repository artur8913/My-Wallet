import java.util.Scanner;

public class Expense {

    final String expenseCategory;
    final float expenseAmount;

    @Override
    public String toString() {
        return "Kategoria: " + expenseCategory + ", Kwota: " + expenseAmount;
    }

    Expense(String expenseCategory, float expenseAmount){

        this.expenseCategory = expenseCategory;
        this.expenseAmount = expenseAmount;
    }

    protected static String readCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kategorie wydatku: ");
        return scanner.next();
    }

    protected static float readAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj kwote wydatku: ");
        return scanner.nextFloat();
    }

    public static Expense read() {
        return new Expense(readCategory(), readAmount());
    }

    public void print() {
        System.out.print(this);
    }
}
