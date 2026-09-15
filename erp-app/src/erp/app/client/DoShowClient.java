package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows one client, given its identifier (an e-mail address).
 */
class DoShowClient extends Command<ErpManager> {

    DoShowClient(ErpManager receiver) {
        super(Label.SHOW_CLIENT, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
