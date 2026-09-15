package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows the notifications a client has received since they were last shown,
 * in the order they were sent; showing them empties the client's inbox.
 */
class DoShowClientNotifications extends Command<ErpManager> {

    DoShowClientNotifications(ErpManager receiver) {
        super(Label.SHOW_CLIENT_NOTIFICATIONS, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
