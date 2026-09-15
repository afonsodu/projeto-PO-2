package erp.app.purchase;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows every purchase (its summary line only), ordered by identifier.
 */
class DoShowPurchases extends Command<ErpManager> {

    DoShowPurchases(ErpManager receiver) {
        super(Label.SHOW_PURCHASES, receiver);
	//FIXME maybe define fields
    }

    @Override
    protected final void execute() {
        //FIXME implement command
    }

}
