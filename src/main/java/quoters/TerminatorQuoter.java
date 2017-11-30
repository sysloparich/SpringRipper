package quoters;

public class TerminatorQuoter implements Quoter{

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public void sayQuote() {
        System.out.println("message = " + message);
    }
}
