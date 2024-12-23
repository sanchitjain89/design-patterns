package cor;

class ProjectManager extends ExpenseHandler {
    public ProjectManager() {
        this.approvalLimit = 5000; // Can approve up to $5000
    }

    @Override
    protected void approve(ExpenseRequest request) {
        System.out.println("Project Manager approved expense request #" +
                request.getId() + " for $" + request.getAmount());
    }

    @Override
    protected void deny(ExpenseRequest request) {
        System.out.println("Project Manager cannot approve request #" +
                request.getId() + " for $" + request.getAmount());
    }
}
