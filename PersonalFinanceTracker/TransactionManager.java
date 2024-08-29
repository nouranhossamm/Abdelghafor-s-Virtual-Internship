package PersonalFinanceTracker;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Summary getSummary() {
        double totalIncome = 0;
        double totalExpenses = 0;

        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > 0) {
                totalIncome += transaction.getAmount();
            } else {
                totalExpenses += Math.abs(transaction.getAmount());
            }
        }

        return new Summary(totalIncome, totalExpenses, totalIncome - totalExpenses);
    }

    public Insights getInsights() {
        Map<Category, Double> expensesByCategory = new HashMap<>();

        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < 0) {
                Category category = transaction.getCategory();
                double amount = Math.abs(transaction.getAmount());

                if (expensesByCategory.containsKey(category)) {
                    expensesByCategory.put(category, expensesByCategory.get(category) + amount);
                } else {
                    expensesByCategory.put(category, amount);
                }
            }
        }

        return new Insights(expensesByCategory);
    }
}