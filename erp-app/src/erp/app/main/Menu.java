package erp.app.main;

import erp.ErpManager;

/** The main menu: file operations, the date, and the management menus. */
public class Menu extends pt.tecnico.uilib.menus.Menu {

    public Menu(ErpManager receiver) {
        super(Label.TITLE, // 4.1
                new DoOpenFile(receiver), //
                new DoSaveFile(receiver), //
                new DoDisplayDate(receiver), //
                new DoAdvanceDate(receiver), //
                new DoOpenMenuCompanies(receiver), //
                new DoOpenMenuProducts(receiver), //
                new DoOpenMenuClients(receiver),
                new DoOpenMenuPurchases(receiver) //
        );
    }

}
