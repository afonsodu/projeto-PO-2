package erp.app.client;

import erp.ErpManager;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME maybe import classes

/** Registers a client. The e-mail address is its identifier, so it must be new. */
class DoRegisterClient extends Command<ErpManager> {

    DoRegisterClient(ErpManager receiver) {
        super(Label.REGISTER_CLIENT, receiver);
        //FIXME maybe define fields
    }

    @Override
    protected final void execute() throws CommandException {
        //FIXME implement command
    }

}
