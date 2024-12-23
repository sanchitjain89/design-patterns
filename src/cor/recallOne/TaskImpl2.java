package cor.recallOne;

public class TaskImpl2 implements Task{

    Task next;

    @Override
    public void execute(int bill) {
        if (bill < 100){
            System.out.println("Approved by " + this.getClass().getName());
        } else{
            next.execute(bill);
        }
    }
}
