package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

/**
 * The ExitCommand is given when the user wants to exit Duke.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "bye";
    public static final String EXIT_MSG = "Bye. Hope to see you again soon!";

    public ExitCommand() {

    }

    /**
     * Prints the Exit Message.
     *
     * @param tasks the given TaskList.
     * @param ui the given Ui.
     * @param storage the given Storage.
     * @throws DukeException
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.printMsg(EXIT_MSG);
    }

    /**
     * Returns true since this is the exit Command.
     *
     * @return true.
     */
    @Override
    public boolean isExit() {
        return true;
    }
}
