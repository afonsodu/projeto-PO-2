package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * §4.1.1 Open and load files.
 */
class DoOpenFile extends Command<ErpManager> {

    DoOpenFile(ErpManager receiver) {
        super(Label.OPEN_FILE, receiver);
	//FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
