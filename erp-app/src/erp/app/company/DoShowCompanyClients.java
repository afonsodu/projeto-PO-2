package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows the clients that have bought from a company, ordered by identifier
 * (their e-mail address).
 */
class DoShowCompanyClients extends Command<ErpManager> {

    DoShowCompanyClients(ErpManager receiver) {
        super(Label.SHOW_COMPANY_CLIENTS, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
