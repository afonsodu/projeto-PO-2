package erp.app.basket;

import erp.ErpManager;
import erp.basket.Basket;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/** Shows the basket: its header followed by one line per product. */
class DoShowBasket extends BasketCommand {

    DoShowBasket(ErpManager manager, Basket basket) {
        super(Label.SHOW_BASKET, manager, basket);
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
