package cor.recallOne;

public class Demo {

    public static void main(String[] args) {

        TaskImpl1 firstTask = new TaskImpl1();
        TaskImpl2 secondTask = new TaskImpl2();
        TaskImpl3 thirdTask = new TaskImpl3();

        firstTask.next = secondTask;
        secondTask.next = thirdTask;

        firstTask.execute(150);

        firstTask.execute(90);

        firstTask.execute(40);

    }
}
