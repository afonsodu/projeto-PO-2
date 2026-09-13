package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class UnknownCompanyKeyException extends CommandException {
    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    public UnknownCompanyKeyException(int id) {
        super(Message.unknownCompany(id));
    }
}
