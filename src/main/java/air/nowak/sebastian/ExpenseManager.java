package air.nowak.sebastian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExpenseManager {

    List<Expense> expenses = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void displayAllexpenses(){
        expenses.forEach(ExpenseManager::displayExpense);
    }

    private static void displayExpense(Expense expense) {
        System.out.println();
        System.out.println("Kategoria: "+expense.getType());
        System.out.println("Miesiąc: "+expense.getMonth());
        System.out.println("Koszt: "+expense.getValue());
        System.out.println("Opis:" +expense.getDescription());
        System.out.println("----------------------------------");

    }


    public void AddData(){
        expenses.add(new Expense("jedzenie",1,35,"Jedzenie ze znajomymi"));
        expenses.add(new Expense("gry",5,120.22,"Diablo IV"));
        expenses.add(new Expense("samochod",1,150.32,"Paliwo"));
        expenses.add(new Expense("dom",12,560,"Czynasz za mieszkanie"));
    }
    public void Addexpenses(){
        System.out.println("Podaj rodzaj wydatku: ");
        String type = scanner.nextLine();
        System.out.println("Podaj miesiac: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj Koszt: ");
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("Podaj opis wydatku:");
        String description = scanner.nextLine();

        expenses.add(new Expense(type,month,value,description));
    }

    public void SumExpensesInMonth(){
        System.out.println("Z jakiego miesiąca chcesz wyświetlić wydatki?");
        int month = Integer.parseInt(scanner.nextLine());

        expenses.stream()
                        .filter(expense -> expense.getMonth()==month)
                                .forEach(ExpenseManager::displayExpense);

    }


}
