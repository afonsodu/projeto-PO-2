package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.1.3. Advance the current date.
 */
class DoAdvanceDate extends Command<ErpManager> {

    DoAdvanceDate(ErpManager receiver) {
        super(Label.ADVANCE_DATE, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
