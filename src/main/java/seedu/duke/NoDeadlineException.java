package seedu.duke;

/**
 * Encapsulates the exception where the deadline for a Deadline event is not specified.
 */
public class NoDeadlineException extends DukeException {
    public NoDeadlineException() {
        super("____________________________________________________________\n" +
                " ☹ OOPS!!! There is no deadline given.\n" +
                "____________________________________________________________");
    }
}
