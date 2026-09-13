package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

/** The data given for a new product does not describe a valid product. */
public class ProductRegistrationFailedException extends CommandException {

    @java.io.Serial
    private static final long serialVersionUID = 202608261200L;

    public ProductRegistrationFailedException(String name) {
        super(Message.productRegistrationFailed(name));
    }

}
