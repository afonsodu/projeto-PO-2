package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows the current date of the system.
 */
class DoDisplayDate extends Command<ErpManager> {

    DoDisplayDate(ErpManager receiver) {
        super(Label.DISPLAY_DATE, receiver);
	//FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
