package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows every client, ordered by name and then by identifier.
 */
class DoShowClients extends Command<ErpManager> {

    DoShowClients(ErpManager receiver) {
        super(Label.SHOW_CLIENTS, receiver);
    }

    @Override
    protected final void execute() {
        //FIXME implement command
    }

}
