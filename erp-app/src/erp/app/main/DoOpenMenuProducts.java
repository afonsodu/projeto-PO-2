package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;

/**
 * §4.1.4 Management menus.
 */
class DoOpenMenuProducts extends Command<ErpManager> {

    DoOpenMenuProducts(ErpManager receiver) {
        super(Label.OPEN_MENU_PRODUCTS, receiver);
    }

    @Override
    protected final void execute() throws CommandException {
        (new erp.app.product.Menu(_receiver)).open();
    }

}
