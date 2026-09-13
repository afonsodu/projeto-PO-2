package erp.app.main;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
//FIXME maybe import classes

/**
 * §4.1.1 Open and load files.
 */
class DoSaveFile extends Command<ErpManager> {

    DoSaveFile(ErpManager receiver) {
        super(Label.SAVE_FILE, receiver);
	//FIXME maybe define fields
    }

    @Override
    protected final void execute() {
        //FIXME implement command
    }

}
