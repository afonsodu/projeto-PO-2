package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.4. Show a specific client.
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
