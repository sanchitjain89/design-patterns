package cor;

// Request class
class ExpenseRequest {
    private int id;
    private double amount;
    private String purpose;

    public ExpenseRequest(int id, double amount, String purpose) {
        this.id = id;
        this.amount = amount;
        this.purpose = purpose;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getPurpose() {
        return purpose;
    }
}
