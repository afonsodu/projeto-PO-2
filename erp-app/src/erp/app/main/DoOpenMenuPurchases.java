package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

/**
 * Opens the purchase management menu.
 */
class DoOpenMenuPurchases extends Command<ErpManager> {

    DoOpenMenuPurchases(ErpManager receiver) {
        super(Label.OPEN_MENU_PURCHASES, receiver);
    }

    @Override
    protected final void execute() throws CommandException {
        (new erp.app.purchase.Menu(_receiver)).open();
    }

}
