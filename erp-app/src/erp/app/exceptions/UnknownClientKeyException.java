package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class UnknownClientKeyException extends CommandException {
    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    public UnknownClientKeyException(String id) {
        super(Message.unknownClient(id));
    }
}
