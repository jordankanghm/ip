package seedu.duke;
import java.util.ArrayList;

public class Ui {
    public Ui() {

    }

    // Prints a data format error
    public void showLoadingError() {
        System.out.println("____________________________________________________________\n" +
                " ☹ OOPS!!! The saved data format is invalid!\n" +
                "____________________________________________________________");
    }

    // Prints the tasks in the taskList given
    public void printListItems(TaskList taskList) {
        ArrayList<Task> tasks = taskList.getTasks();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println(i+1 + "." + task.getTaskType() + task.getStatusIcon() + " " + task.name +
                    " " + task.getTimeInfo());
        }
    }

    // Prints the introduction message at the start of the program
    public void printIntro() {
        String intro = "____________________________________________________________\n" +
                " Hello! I'm Dookie\n" +
                " What can I do for you?\n" +
                "____________________________________________________________";
        System.out.println(intro);
    }

    // Prints the message for when a new task is added
    public void printAddTaskMessage(Task task, TaskList tasks) {
        int listSize = tasks.getTasks().size();
        String message = "____________________________________________________________\n" +
                " Got it. I've added this task: \n   " +
                task.getTaskType() + task.getStatusIcon() + " " + task.name + task.getTimeInfo() + "\n" +
                " Now you have " + listSize + " tasks in the list.\n" +
                "____________________________________________________________";
        System.out.println(message);
    }

    // Prints the message for when a task is deleted
    public void printDeleteTaskMessage(Task task, TaskList tasks){
        int listSize = tasks.getTasks().size();

        String message = "____________________________________________________________\n" +
                " Noted. I've removed this task: \n   " +
                task.getTaskType() + task.getStatusIcon() + " " + task.name + task.getTimeInfo() + "\n" +
                " Now you have " + listSize + " tasks in the list.\n" +
                "____________________________________________________________";
        System.out.println(message);
    }

    // Prints the message at the end of the program
    public void printExit() {
        String exitMessage = "____________________________________________________________\n" +
                " Bye. Hope to see you again soon!\n" +
                "____________________________________________________________";
        System.out.println(exitMessage);
    }

    // Prints the message when a task is marked
    public void printMarkedTaskMessage(Task task) {
        String message = "____________________________________________________________\n" +
                " Nice! I've marked this task as done:\n" +
                "   " + task.getStatusIcon() + " " + task.name + task.getTimeInfo() + "\n" +
                "____________________________________________________________";
        System.out.println(message);
    }

    // Prints the message when a task is unmarked
    public void printUnmarkedTaskMessage(Task task) {
        String message = "____________________________________________________________\n" +
                " OK. I've marked this task as not done yet:\n" +
                "   " + task.getStatusIcon() + " " + task.name + task.getTimeInfo() + "\n" +
                "____________________________________________________________";
        System.out.println(message);
    }

    public void printFindResults(ArrayList<Task> results) {
        String message = "    ____________________________________________________________\n" +
                "     Here are the matching tasks in your list:\n";

        for (int i = 0; i < results.size(); i++) {
            Task task = results.get(i);
            message += "     " + (i+1) + "." + task.getTaskType() + task.getStatusIcon() + " " + task.name +
                    " " + task.getTimeInfo() + "\n";
        }

        message += "    ____________________________________________________________";

        System.out.println(message);
    }
}
