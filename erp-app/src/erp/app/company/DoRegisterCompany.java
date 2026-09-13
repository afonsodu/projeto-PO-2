package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.2. Register a new company.
 */
class DoRegisterCompany extends Command<ErpManager> {

    DoRegisterCompany(ErpManager receiver) {
        super(Label.REGISTER_COMPANY, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
