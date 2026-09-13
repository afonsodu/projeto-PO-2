package erp.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

/** The given company does not supply the given product. */
public class ProductNotSuppliedException extends CommandException {

    @java.io.Serial
    private static final long serialVersionUID = 202608261200L;

    public ProductNotSuppliedException(int idCompany, int idProduct) {
        super(Message.productNotSupplied(idCompany, idProduct));
    }

}
