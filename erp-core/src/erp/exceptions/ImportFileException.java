package erp.exceptions;

/**
 * Represents an error that has occurred during the parsing of the import file.
 * This could be due to an IOException or a line of the import file using an invalid format
 * (represented by UnrecognizedEntryException).
 */
public class ImportFileException extends Exception {

    @java.io.Serial
    private static final long serialVersionUID = 202607021200L;

    private static final String ERROR_MESSAGE = "Erro a processar ficheiro de import: ";

    public ImportFileException(String filename) {
        super(ERROR_MESSAGE + filename);
    }

    public ImportFileException(String filename, Exception cause) {
        super(ERROR_MESSAGE + filename, cause);
    }

}
