package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Advances the current date by a number of days, raising the delivery
 * notifications that the jump crosses. A non-positive number of days has no effect.
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
