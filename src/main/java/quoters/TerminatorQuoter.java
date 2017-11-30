package quoters;

import javax.annotation.PostConstruct;

@Profiling
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

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    @PostProxy
    public void sayQuote() {
        System.out.println("3 phase");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
