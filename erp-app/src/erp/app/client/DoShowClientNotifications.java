package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.4. Show the pending notifications of a client.
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
