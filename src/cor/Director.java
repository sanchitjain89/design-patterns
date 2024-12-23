package cor;

class Director extends ExpenseHandler {
    public Director() {
        this.approvalLimit = 10000; // Can approve up to $10000
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Director approved expense request #" +
                request.getId() + " for $" + request.getAmount());
    }

    @Override
    protected void deny(ExpenseRequest request) {
        System.out.println("Director cannot approve request #" +
                request.getId() + " for $" + request.getAmount());
    }
}
