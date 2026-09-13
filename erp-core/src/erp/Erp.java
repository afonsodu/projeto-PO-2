package erp;

import erp.exceptions.*;
import java.io.IOException;
import java.io.Serializable;
// FIXME maybe import classes

/** The whole ERP system: holds all the state and the domain logic. */
class Erp implements Serializable {

    @java.io.Serial
    private static final long serialVersionUID = 202608261200L;

    //FIXME maybe define attributes
    //FIXME maybe implement constructor
    //FIXME maybe implement methods

    // --- text file import --------------------------------------------------

    void importFile(String filename) throws UnrecognizedEntryException, IOException
                       /* FIXME maybe other exceptions */ {
        //FIXME implement method
    }

}
