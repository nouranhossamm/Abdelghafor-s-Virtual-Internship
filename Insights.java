import java.util.Map;

public class Insights {
    private Map<Category, Double> expensesByCategory;

    public Insights(Map<Category, Double> expensesByCategory) {
        this.expensesByCategory = expensesByCategory;
    }

    public Map<Category, Double> getExpensesByCategory() {
        return expensesByCategory;
    }
}
