package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class ClientRegistrationFailedException extends CommandException {
    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    public ClientRegistrationFailedException(String name, String email) {
        super(Message.clientRegistrationFailed(name, email));
    }
}
