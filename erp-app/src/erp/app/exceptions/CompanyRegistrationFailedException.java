package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class CompanyRegistrationFailedException extends CommandException {
    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    public CompanyRegistrationFailedException(String name) {
        super(Message.companyRegistrationFailed(name));
    }
}
