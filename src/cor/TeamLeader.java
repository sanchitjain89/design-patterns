package cor;

// Concrete handlers
class TeamLeader extends ExpenseHandler {
    public TeamLeader() {
        this.approvalLimit = 1000; // Can approve up to $1000
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Team Leader approved expense request #" +
                request.getId() + " for $" + request.getAmount());
    }

    @Override
    protected void deny(ExpenseRequest request) {
        System.out.println("Team Leader cannot approve request #" +
                request.getId() + " for $" + request.getAmount());
    }
}
