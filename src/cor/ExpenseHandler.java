package cor;

// Abstract handler class
abstract class ExpenseHandler {

    protected ExpenseHandler nextHandler;
    protected double approvalLimit;

    public void setNext(ExpenseHandler handler) {
        this.nextHandler = handler;
    }

    public void processExpense(ExpenseRequest request) {
        if (request.getAmount() <= approvalLimit) {
            approve(request);
        } else if (nextHandler != null) {
            nextHandler.processExpense(request);
        } else {
            deny(request);
        }
    }

    protected abstract void approve(ExpenseRequest request);

    protected abstract void deny(ExpenseRequest request);
}
