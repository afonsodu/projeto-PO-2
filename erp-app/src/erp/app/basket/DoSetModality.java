package erp.app.basket;

import erp.ErpManager;
import erp.basket.Basket;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/**
 * Chooses the modality every order of this purchase will travel under, which
 * fixes both what the transport costs and how long it takes.
 *
 * <p>Only the modalities with a tariff defined are offered, so the choice always
 * resolves to a usable rate.</p>
 */
class DoSetModality extends BasketCommand {

    DoSetModality(ErpManager manager, Basket basket) {
        super(Label.SET_MODALITY, manager, basket, /*FIXME add validity condition*/);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
