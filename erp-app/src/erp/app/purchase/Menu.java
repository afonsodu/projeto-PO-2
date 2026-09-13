package erp.app.purchase;

import erp.ErpManager;

/** Menu for the purchase and order operations. */
public class Menu extends pt.tecnico.uilib.menus.Menu {

    public Menu(ErpManager receiver) {
        super(Label.TITLE,
                new DoDoPurchase(receiver),
                new DoShowPurchase(receiver),
                new DoShowPurchases(receiver));
    }

}
