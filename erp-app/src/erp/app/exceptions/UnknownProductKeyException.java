package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class UnknownProductKeyException extends CommandException {
    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    public UnknownProductKeyException(int id) {
        super(Message.unknownProduct(id));
    }
}
