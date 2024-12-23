package cor.recallOne;

public class TaskImpl3 implements Task{

    @Override
    public void execute(int bill) {
        System.out.println("Approved by " + this.getClass().getName());
    }
}
