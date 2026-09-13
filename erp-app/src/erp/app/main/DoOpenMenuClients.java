package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

/**
 * §4.1.4 Management menus.
 */
class DoOpenMenuClients extends Command<ErpManager> {

    DoOpenMenuClients(ErpManager receiver) {
        super(Label.OPEN_MENU_CLIENTS, receiver);
    }

    @Override
    protected final void execute() throws CommandException {
        (new erp.app.client.Menu(_receiver)).open();
    }

}
