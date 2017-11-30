package quoters;

public class TerminatorQuoter implements Quoter{

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
