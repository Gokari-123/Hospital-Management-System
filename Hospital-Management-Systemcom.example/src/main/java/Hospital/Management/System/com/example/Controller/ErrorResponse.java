package Hospital.Management.System.com.example.Controller;

public class ErrorResponse {

    private String message;

    public ErrorResponse(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
