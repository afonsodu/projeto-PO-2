package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.2. Show all companies (ordered by id).
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
