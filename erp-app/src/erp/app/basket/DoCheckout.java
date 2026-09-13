package erp.app.basket;

import erp.ErpManager;
import erp.basket.Basket;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Turns the basket into a purchase, shows it, and closes the menu.
 *
 * <p>Only offered once the basket has lines and a modality. If some product ran
 * out since it was added, the checkout fails without any effect and the menu
 * stays open, so the basket can be fixed and checked out again.</p>
 */
class DoCheckout extends BasketCommand {

    DoCheckout(ErpManager manager, Basket basket) {
        super(true, Label.CHECKOUT, manager, basket, /*FIXME add validity condition*/);
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
