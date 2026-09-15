package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows every company, ordered by identifier.
 */
class DoShowCompanies extends Command<ErpManager> {

    DoShowCompanies(ErpManager receiver) {
        super(Label.SHOW_COMPANIES, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
