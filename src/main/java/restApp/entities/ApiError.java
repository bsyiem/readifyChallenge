package restApp.entities;

/**
 * Created by brandon on 16/11/17.
 * Class that contains error message;
 */


public class ApiError {
    public ApiError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;
}
