package erp.app.product;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * 4.3. Show a specific product.
 */
class DoShowProduct extends Command<ErpManager> {

    DoShowProduct(ErpManager receiver) {
        super(Label.SHOW_PRODUCT, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
