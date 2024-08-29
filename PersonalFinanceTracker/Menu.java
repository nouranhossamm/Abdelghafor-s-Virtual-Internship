package PersonalFinanceTracker;

import java.util.*;

public class Menu {
    private TransactionManager transactionManager;

    public Menu(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Input Transaction");
            System.out.println("2. View Transactions");
            System.out.println("3. View Summary");
            System.out.println("4. Get Insights");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputTransaction(scanner);
                    break;
                case 2:
                    viewTransactions();
                    break;
                case 3:
                    viewSummary();
                    break;
                case 4:
                    getInsights();
                    break;
                case 5:
                    System.out.println("Thank you for using the Personal Finance Tracker. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void inputTransaction(Scanner scanner) {
        System.out.print("Enter description: ");
        String description = scanner.next();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter category: ");
        String category = scanner.next();

        Category categoryObject = new Category(category);
        Transaction transaction = new Transaction(description, amount, categoryObject);
        transactionManager.addTransaction(transaction);
    }

    private void viewTransactions() {
        List<Transaction> transactions = transactionManager.getTransactions();
        System.out.println("Transactions:");
        System.out.println("-----------------------------------------------------");
        System.out.println("| Description          | Amount    | Category       |");
        System.out.println("-----------------------------------------------------");
        for (Transaction transaction : transactions) {
            System.out.printf("| %-20s | %8.2f | %-10s |\n",
                    transaction.getDescription(), transaction.getAmount(), transaction.getCategory().getName());
        }

        System.out.println("Would you like to sort the transactions by amount? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String sortChoice = scanner.next();

        if (sortChoice.equalsIgnoreCase("yes")) {
            System.out.println("Would you like to sort in ascending or descending order? (asc/desc)");
            String sortOrder = scanner.next();

            List<Transaction> sortedTransactions = new ArrayList<>(transactions);

            if (sortOrder.equalsIgnoreCase("asc")) {
                sortedTransactions.sort(Comparator.comparingDouble(Transaction::getAmount));
            } else if (sortOrder.equalsIgnoreCase("desc")) {
                sortedTransactions.sort(Comparator.comparingDouble(Transaction::getAmount).reversed());
            }

            System.out.println("Sorted Transactions:");
            System.out.println("-----------------------------------------------------");
            System.out.println("| Description          | Amount    | Category       |");
            System.out.println("-----------------------------------------------------");
            for (Transaction transaction : sortedTransactions) {
                System.out.printf("| %-20s | %8.2f | %-10s |\n",
                        transaction.getDescription(), transaction.getAmount(), transaction.getCategory().getName());
            }
        }
    }
    private void viewSummary() {
        Summary summary = transactionManager.getSummary();
        System.out.println("Summary:");
        System.out.println("Total Income: " + summary.getTotalIncome());
        System.out.println("Total Expenses: " + summary.getTotalExpenses());
        System.out.println("Balance: " + summary.getBalance());
    }

    private void getInsights() {
        Map<Category, Double> categoryExpenses = new HashMap<>();
        double totalExpenses = 0.0;

        for (Transaction transaction : transactionManager.getTransactions()) {
            if (transaction.getAmount() < 0) {
                Category category = transaction.getCategory();
                double amount = Math.abs(transaction.getAmount());

                categoryExpenses.put(category, categoryExpenses.getOrDefault(category, 0.0) + amount);
                totalExpenses += amount;
            }
        }

        System.out.println("Insights:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| Category          | Total Expenses | Percentage of Total Expenses |");
        System.out.println("---------------------------------------------------------------------");

        for (Map.Entry<Category, Double> entry : categoryExpenses.entrySet()) {
            double percentage = (entry.getValue() / totalExpenses) * 100;
            System.out.printf("| %-20s | %12.2f | %20.2f%% |\n",
                    entry.getKey().getName(), entry.getValue(), percentage);
        }
    }

    public static void main(String[] args) {
        TransactionManager transactionManager = new TransactionManager();
        Menu menu = new Menu(transactionManager);
        menu.run();
    }
}