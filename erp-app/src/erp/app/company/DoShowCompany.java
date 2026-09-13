package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.2. Show a specific company.
 */
class DoShowCompany extends Command<ErpManager> {

    DoShowCompany(ErpManager receiver) {
        super(Label.SHOW_COMPANY, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
