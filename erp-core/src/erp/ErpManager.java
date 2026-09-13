package erp;

import erp.exceptions.*;
import java.io.*;
//FIXME maybe import classes

/**
 * The façade of the ERP core: the single entry point through which the
 * application interacts with the domain.
 *
 * <p><b>Façade</b> pattern.</p>
 */
public class ErpManager {

    /** The object doing all the actual work. */
    private Erp _erp = new Erp();

    //FIXME maybe define constructors

    // --- persistence -------------------------------------------------------

    public void save() throws MissingFileAssociationException, IOException {
        //FIXME implement method
    }

    public void saveAs(String filename) throws MissingFileAssociationException, IOException {
        //FIXME implement method
    }

    public void load(String filename) throws UnavailableFileException {
        //FIXME implement method
    }

    public void importFile(String filename) throws ImportFileException {
        try {
            if (filename != null && !filename.isEmpty())
                _erp.importFile(filename);
        } catch (IOException | UnrecognizedEntryException /* FIXME maybe other exceptions */ e) {
            throw new ImportFileException(filename, e);
        }
    }

    //FIXME implement other methods

}
