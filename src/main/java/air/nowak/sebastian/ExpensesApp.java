package air.nowak.sebastian;

import java.util.Scanner;

public class ExpensesApp {

    public static void start()
    {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager expenseManager = new ExpenseManager();
        while (true){
            System.out.println("Zarzadzaj wydatkami");
            System.out.println("1. Wyswietl wszystkie wydatki");
            System.out.println("2. Dodaj wydatke");
            System.out.println("3. Wyswietl wydatki w danym miesiacu");
            System.out.println("4. Wgraj baze wydatków");
            System.out.println("5. Wyjdz z programu");

            int choice =   Integer.parseInt(scanner.nextLine());

            switch (choice)
            {
                case  1 -> expenseManager.displayAllexpenses();
                case  2 -> expenseManager.Addexpenses();
                case  3 -> expenseManager.SumExpensesInMonth();
                case  4 -> expenseManager.AddData();
                case  5 -> {
                    scanner.close();
                    System.exit(0);
                }
            }


        }
    }
}
