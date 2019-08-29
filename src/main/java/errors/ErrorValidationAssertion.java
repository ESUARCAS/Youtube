package errors;

public class ErrorValidationAssertion extends AssertionError {
    private static final long serialVersionUID = 1L;
    public static final String ERROR_VALIDATION = "The obtained result doesn't equal to expected result";

    public ErrorValidationAssertion(String message) {
        super(message);
    }
}
