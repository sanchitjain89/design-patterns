package cor;

// Client code
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create the chain of responsibility
        TeamLeader teamLeader = new TeamLeader();
        ProjectManager projectManager = new ProjectManager();
        Director director = new Director();

        teamLeader.setNext(projectManager);
        projectManager.setNext(director);

        // Create some expense requests
        ExpenseRequest request1 = new ExpenseRequest(1, 800, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(2, 4000, "Training Program");
        ExpenseRequest request3 = new ExpenseRequest(3, 8000, "Conference");
        ExpenseRequest request4 = new ExpenseRequest(4, 12000, "Equipment");

        // Process the requests
        teamLeader.processExpense(request1);  // Handled by Team Leader
        teamLeader.processExpense(request2);  // Handled by Project Manager
        teamLeader.processExpense(request3);  // Handled by Director
        teamLeader.processExpense(request4);  // Denied (exceeds all limits)
    }
}
