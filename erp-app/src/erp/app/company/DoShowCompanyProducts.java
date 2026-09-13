package erp.app.company;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/** Shows what a company supplies: units, price factor and selling price. */
class DoShowCompanyProducts extends Command<ErpManager> {

    DoShowCompanyProducts(ErpManager receiver) {
        super(Label.SHOW_COMPANY_PRODUCTS, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
