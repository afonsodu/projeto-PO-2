package erp.app.product;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Shows every product, ordered by identifier.
 */
class DoShowProducts extends Command<ErpManager> {

    DoShowProducts(ErpManager receiver) {
        super(Label.SHOW_PRODUCTS, receiver);
	//FIXME maybe define fields
    }

    @Override
    protected final void execute() {
        //FIXME implement command
    }

}
